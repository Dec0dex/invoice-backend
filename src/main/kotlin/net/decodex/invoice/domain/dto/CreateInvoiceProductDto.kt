package net.decodex.invoice.domain.dto

import java.util.*

class CreateInvoiceProductDto() {
    var price: Double = 0.0
    var discount: Int? = 0
    var quantity: Int? = 0

    var id: Long = 0
    var productId: Long = 0
}