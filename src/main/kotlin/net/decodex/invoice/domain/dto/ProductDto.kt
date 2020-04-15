package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.Product
import java.util.*

class ProductDto() {

    constructor(product: Product): this() {
        this.name = product.name
        this.id = product.id
        this.pdv = product.pdv
        this.price = product.productPrices.minBy { it.id }!!.price
        this.barcode = product.barcode
        this.unitOfMeasure = UnitOfMeasureDto(product.unitOfMeasure)
        this.companyId = product.company.id
        this.createdAt = product.createdAt
        this.updatedAt = product.updatedAt
    }

    lateinit var name: String
    lateinit var unitOfMeasure: UnitOfMeasureDto
    var price: Double = 0.0
    var pdv: Int = 0
    var barcode: String? = null

    var id: Long = 0
    var companyId: Long = 0

    var createdAt: Date? = null
    var updatedAt: Date? = null
}