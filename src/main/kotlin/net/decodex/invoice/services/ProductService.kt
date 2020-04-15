package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.*
import net.decodex.invoice.domain.dto.ProductDto
import net.decodex.invoice.domain.model.Product
import net.decodex.invoice.domain.model.ProductPrice
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {

    @Autowired
    private lateinit var productRepository: ProductDao

    @Autowired
    private lateinit var companyRepository: CompanyDao

    @Autowired
    private lateinit var uomRepository: UnitOfMeasureDao

    @Autowired
    private lateinit var productPriceRepository: ProductPriceDao

    @Autowired
    private lateinit var clientRepository: ClientDao

    fun getProductById(id: Long): ProductDto {
        val product = productRepository.findById(id)

        if (!product.isPresent) {
            throw ResourceNotFoundException()
        }

        return ProductDto(product.get())
    }

    fun getProducts(predicate: Predicate?): List<ProductDto> {
        return productRepository.findAll(predicate).map { ProductDto(it) }
    }

    fun deleteProductById(id: Long) {
        return productRepository.deleteById(id)
    }

    fun createProduct(dto: ProductDto): ProductDto {
        val company = companyRepository.findById(dto.companyId)
        val unitOfMeasure = uomRepository.findById(dto.unitOfMeasure.id)

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        if (!unitOfMeasure.isPresent) {
            throw ResourceNotFoundException()
        }

        var product = Product(dto.name, dto.pdv, company.get(), unitOfMeasure.get(), dto.barcode)
        product = productRepository.save(product)

        var productPrice = ProductPrice(product, dto.price)
        productPrice = productPriceRepository.save(productPrice)
        product.productPrices.add(productPrice)

        return ProductDto(productRepository.save(product))
    }

    fun updateProduct(dto: ProductDto, id: Long): ProductDto {
        val product = productRepository.findById(id)
        val unitOfMeasure = uomRepository.findById(dto.unitOfMeasure.id)
        if (!unitOfMeasure.isPresent) {
            throw ResourceNotFoundException()
        }

        if (!product.isPresent) {
            throw ResourceNotFoundException()
        }

        product.get().name = dto.name
        product.get().barcode = dto.barcode
        product.get().pdv = dto.pdv
        product.get().unitOfMeasure = unitOfMeasure.get()

        productRepository.save(product.get())
        val price = product.get().productPrices.minBy { it.id }!!
        price.price = dto.price
        productPriceRepository.save(price)

        return ProductDto(productRepository.findById(id).get())
    }

    fun getProductPriceForClient(productId: Long, clientId: Long): Double {
        val client = clientRepository.findById(clientId)
        if (!client.isPresent) {
            throw ResourceNotFoundException()
        }

        val product = productRepository.findById(productId)
        if (!product.isPresent) {
            throw ResourceNotFoundException()
        }

        val productList = client.get().productPrices.filter { it.product.id == productId }
        return if (productList.isEmpty()) {
            product.get().productPrices.minBy { it.id }!!.price
        } else {
            productList.maxBy { it.id }!!.price
        }
    }
}