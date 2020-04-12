package net.decodex.invoice.controlers

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.InvoiceDao
import net.decodex.invoice.domain.dto.CreateInvoiceDto
import net.decodex.invoice.domain.dto.InvoiceDto
import net.decodex.invoice.domain.dto.InvoiceProductDto
import net.decodex.invoice.domain.model.Invoice
import net.decodex.invoice.services.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/invoice")
class InvoiceController {

    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping("/{id}")
    fun getInvoiceById(@PathVariable id: Long): InvoiceDto {
        return invoiceService.getInvoiceById(id)
    }

    @GetMapping("/{id}/products")
    fun getInvoiceProducts(@PathVariable id: Long): List<InvoiceProductDto> {
        return invoiceService.getInvoiceProducts(id)
    }

    @GetMapping("/findAll")
    fun getInvoices(
        @QuerydslPredicate(
            root = Invoice::class,
            bindings = InvoiceDao::class
        ) predicate: Predicate?
    ): List<InvoiceDto> {
        return invoiceService.getInvoices(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteInvoice(@PathVariable id: Long) {
        return invoiceService.deleteInvoiceById(id)
    }

    @PostMapping
    fun createInvoice(@RequestBody createDto: CreateInvoiceDto): InvoiceDto {
        return invoiceService.createInvoice(createDto)
    }

    @PutMapping
    fun updateInvoice(@RequestBody clientDto: CreateInvoiceDto): InvoiceDto {
        return invoiceService.updateInvoice(clientDto, clientDto.id)
    }

}