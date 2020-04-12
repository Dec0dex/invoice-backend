package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.ProductPrice
import java.util.*

class InvoiceProductDto() {

    constructor(price: ProductPrice) : this() {
        this.name = price.product.name
        this.id = price.product.id
        this.number = price.number
        this.pdv = price.product.pdv
        this.price = price.price
        this.discount = price.discount
        this.quantity = price.quantity
        this.barcode = price.product.barcode
        this.unitOfMeasure = UnitOfMeasureDto(price.product.unitOfMeasure)
        this.companyId = price.product.company.id
        this.priceId = price.id
    }

    lateinit var name: String
    lateinit var unitOfMeasure: UnitOfMeasureDto
    var price: Double = 0.0
    var pdv: Int = 0
    var discount: Int? = 0
    var quantity: Int? = 0
    var barcode: String? = null

    var id: Long = 0
    var companyId: Long = 0
    var priceId: Long = 0

    var number: Int? = 0

    var createdAt: Date? = null
    var updatedAt: Date? = null
}