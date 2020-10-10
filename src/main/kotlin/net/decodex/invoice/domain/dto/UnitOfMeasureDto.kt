package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.UnitOfMeasure
import java.util.*

class UnitOfMeasureDto() {
    constructor(uom: UnitOfMeasure) : this() {
        id = uom.id
        name = uom.name
        createdAt = uom.createdAt
        updatedAt = uom.updatedAt
        companyId = uom.company.id
    }

    lateinit var name: String

    lateinit var createdAt: Date
    lateinit var updatedAt: Date

    var id: Long = 0
    var companyId: Long = 0
}