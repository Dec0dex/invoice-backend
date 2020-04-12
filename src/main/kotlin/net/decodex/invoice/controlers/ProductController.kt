package net.decodex.invoice.controlers

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.ProductDao
import net.decodex.invoice.domain.dto.ProductDto
import net.decodex.invoice.domain.model.Product
import net.decodex.invoice.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/product")
class ProductController {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): ProductDto {
        return productService.getProductById(id)
    }

    @GetMapping("/findAll")
    fun getProducts(
        @QuerydslPredicate(
            root = Product::class,
            bindings = ProductDao::class
        ) predicate: Predicate?
    ): List<ProductDto> {
        return productService.getProducts(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteProductById(@PathVariable id: Long) {
        return productService.deleteProductById(id)
    }

    @PostMapping
    fun createProduct(@RequestBody productDto: ProductDto): ProductDto {
        return productService.createProduct(productDto)
    }

    @PutMapping
    fun updateProduct(@RequestBody productDto: ProductDto): ProductDto {
        return productService.updateProduct(productDto, productDto.id)
    }

}