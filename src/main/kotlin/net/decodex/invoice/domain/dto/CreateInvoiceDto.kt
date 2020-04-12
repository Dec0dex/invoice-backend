package net.decodex.invoice.domain.dto

import java.util.*

class CreateInvoiceDto() {
    var clientId: Long = 0
    var companyId: Long = 0
    var id: Long = 0
    lateinit var dateCreated: Date
    lateinit var dateOfTraffic: Date
    lateinit var paymentDue: Date
}