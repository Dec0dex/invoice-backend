package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.Client
import net.decodex.invoice.domain.model.Company
import net.decodex.invoice.domain.model.Invoice
import java.util.*

class InvoiceDto() {

    constructor(invoice: Invoice): this() {
        number = invoice.number
        name = invoice.name
        dateCreated = invoice.dateCreated
        dateOfTraffic = invoice.dateOfTraffic
        paymentDue = invoice.paymentDue
        client = ClientDto(invoice.client)
        company = CompanyDto(invoice.company)
        sum = invoice.sum
        payedAmount = invoice.payedAmount
        remainingAmount = invoice.remainingAmount
        id = invoice.id
        createdAt = invoice.createdAt
        updatedAt = invoice.updatedAt
    }

    var number: Int = 0
    lateinit var name: String
    lateinit var dateCreated: Date
    lateinit var dateOfTraffic: Date
    lateinit var paymentDue: Date
    lateinit var client: ClientDto
    lateinit var company: CompanyDto
    var sum: Double = 0.0
    var payedAmount = 0.0
    var remainingAmount = 0.0
    var id: Long = 0

    var createdAt: Date? = null
    var updatedAt: Date? = null
}