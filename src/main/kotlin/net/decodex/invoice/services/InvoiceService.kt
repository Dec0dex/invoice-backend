package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.ClientDao
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dao.InvoiceDao
import net.decodex.invoice.domain.dto.CreateInvoiceDto
import net.decodex.invoice.domain.dto.InvoiceDto
import net.decodex.invoice.domain.dto.InvoiceProductDto
import net.decodex.invoice.domain.model.Invoice
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
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

    fun getInvoiceById(id: Long): InvoiceDto {
        val invoice = invoiceRepository.findById(id)

        if (!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        return InvoiceDto(invoice.get())
    }

    fun getInvoices(predicate: Predicate?): List<InvoiceDto> {
        return invoiceRepository.findAll(predicate).map { InvoiceDto(it) }
    }

    fun deleteInvoiceById(id: Long) {
        return invoiceRepository.deleteById(id)
    }

    fun getInvoiceProducts(id: Long): List<InvoiceProductDto> {
        val invoice = invoiceRepository.findById(id)

        if (!invoice.isPresent) {
            throw ResourceNotFoundException()
        }

        return invoice.get().productPrices.map { InvoiceProductDto(it) }
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