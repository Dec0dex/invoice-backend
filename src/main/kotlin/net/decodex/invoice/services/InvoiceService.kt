package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.*
import net.decodex.invoice.domain.dto.CreateInvoiceDto
import net.decodex.invoice.domain.dto.CreateInvoiceProductDto
import net.decodex.invoice.domain.dto.InvoiceDto
import net.decodex.invoice.domain.dto.InvoiceProductDto
import net.decodex.invoice.domain.model.Invoice
import net.decodex.invoice.domain.model.Product
import net.decodex.invoice.domain.model.ProductPrice
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


@Service
class InvoiceService {

    @Autowired
    lateinit var invoiceRepository: InvoiceDao

    @Autowired
    lateinit var companyRepository: CompanyDao

    @Autowired
    lateinit var clientRepository: ClientDao

    @Autowired
    lateinit var productPriceRepository: ProductPriceDao

    @Autowired
    lateinit var productRepository: ProductDao

    fun getInvoiceById(id: Long): InvoiceDto {
        val invoice = invoiceRepository.findById(id)

        if (!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        return InvoiceDto(invoice.get())
    }

    fun makePayment(id: Long, value: Double) {
        val invoice = invoiceRepository.findById(id)

        if (!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        invoice.get().payedAmount += value
        invoice.get().remainingAmount = invoice.get().sum - invoice.get().payedAmount
        invoiceRepository.save(invoice.get())
    }


    fun getInvoices(predicate: Predicate?): List<InvoiceDto> {
        return invoiceRepository.findAll(predicate, Sort.by("id")).map { InvoiceDto(it) }
    }

    fun deleteInvoiceById(id: Long) {
        return invoiceRepository.deleteById(id)
    }

    fun getInvoiceProducts(id: Long): List<InvoiceProductDto> {
        val invoice = invoiceRepository.findById(id)

        if (!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        return invoice.get().productPrices.map { InvoiceProductDto(it) }.sortedBy { it.number }
    }

    fun createInvoice(createDto: CreateInvoiceDto): InvoiceDto {
        val lastNumber = invoiceRepository.findAllByCreatedAtAfter(getFirstDayOfYear())
        val number = if (lastNumber.isEmpty()) {
            1
        } else {
            lastNumber.last().number + 1
        }

        val company = companyRepository.findById(createDto.companyId)
        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        val client = clientRepository.findById(createDto.clientId)
        if (!client.isPresent) {
            throw ResourceNotFoundException()
        }

        val invoice = Invoice(
            number,
            "FA-${number}-${getCurrentYearString()}",
            createDto.dateCreated,
            createDto.dateOfTraffic,
            createDto.paymentDue,
            company.get(),
            client.get()
        )

        return InvoiceDto(invoiceRepository.save(invoice))
    }


    fun updateInvoice(createDto: CreateInvoiceDto, id: Long): InvoiceDto {
        val invoice = invoiceRepository.findById(id)
        if(!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        val company = companyRepository.findById(createDto.companyId)
        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        val client = clientRepository.findById(createDto.clientId)
        if (!client.isPresent) {
            throw ResourceNotFoundException()
        }

        invoice.get().client = client.get()
        invoice.get().company = company.get()
        invoice.get().dateCreated = createDto.dateCreated
        invoice.get().dateOfTraffic = createDto.dateOfTraffic
        invoice.get().paymentDue = createDto.paymentDue

        return InvoiceDto(invoiceRepository.save(invoice.get()))
    }

    fun deleteInvoiceProduct(id: Long, priceId: Long) {
        var invoice = invoiceRepository.findById(id)
        if(!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        val price = productPriceRepository.findById(priceId)
        if(!price.isPresent) {
            throw ResourceNotFoundException()
        }

        val sumToMinus = calculateProductSum(price.get(), price.get().product)

        if (invoice.get().productPrices.contains(price.get())) {
            invoice.get().productPrices.remove(price.get())
            invoice.get().sum -= sumToMinus
            invoice.get().remainingAmount -= sumToMinus
            invoiceRepository.save(invoice.get())
            productPriceRepository.delete(price.get())
            val tmpInvoice = invoiceRepository.findById(id)
            var number = 1
            tmpInvoice.get().productPrices.sortedBy { it.id }.forEach {
                it.number = number
                productPriceRepository.save(it)
                number += 1
            }
        }
    }

    fun createInvoiceProduct(id: Long, dto: CreateInvoiceProductDto): InvoiceProductDto {
        val invoice = invoiceRepository.findById(id)
        if(!invoice.isPresent) {
            throw ResourceNotFoundException()
        }
        val product = productRepository.findById(dto.productId)
        if(!product.isPresent) {
            throw ResourceNotFoundException()
        }

        val number = if (invoice.get().productPrices.isEmpty()) {
            1
        } else {
            invoice.get().productPrices.last().number!! + 1
        }

        val productPrice = ProductPrice(
            product.get(),
            dto.price,
            dto.discount,
            dto.quantity,
            number,
            invoice.get(),
            invoice.get().client
        )

        val productValue = calculateProductSum(productPrice, product.get())
        invoice.get().sum += productValue
        invoice.get().remainingAmount += productValue
        invoiceRepository.save(invoice.get())

        return InvoiceProductDto(productPriceRepository.save(productPrice))
    }

    fun updateInvoiceProduct(id: Long, dto: CreateInvoiceProductDto): InvoiceProductDto {
        val invoice = invoiceRepository.findById(id)
        if(!invoice.isPresent) {
            throw ResourceNotFoundException()
        }
        val product = productRepository.findById(dto.productId)
        if(!product.isPresent) {
            throw ResourceNotFoundException()
        }
        val productPrice = productPriceRepository.findById(dto.id)
        if(!productPrice.isPresent) {
            throw ResourceNotFoundException()
        }

        val preChangePrice = calculateProductSum(productPrice.get(), product.get())

        productPrice.get().price = dto.price
        productPrice.get().discount = dto.discount
        productPrice.get().quantity = dto.quantity
        productPrice.get().product = product.get()

        val postChangePrice = calculateProductSum(productPrice.get(), product.get())
        invoice.get().sum -= preChangePrice
        invoice.get().sum += postChangePrice
        invoice.get().remainingAmount -= preChangePrice
        invoice.get().remainingAmount += postChangePrice
        invoiceRepository.save(invoice.get())

        return InvoiceProductDto(productPriceRepository.save(productPrice.get()))
    }

    private fun calculateProductSum(price: ProductPrice, product: Product): Double {
        var basePrice = price.price * price.quantity!!
        val discountRate = price.discount?: 0
        val discount = basePrice * (discountRate / 100.0)
        basePrice -= discount
        val taxRate = basePrice * (product.pdv / 100.0)
        return basePrice + taxRate
    }

    private fun getFirstDayOfYear(): Date {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.MONTH, Calendar.JANUARY)
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        return calendar.time
    }

    private fun getCurrentYearString(): String {
        val date: DateFormat = SimpleDateFormat("yyyy")
        return date.format(Date())
    }
}