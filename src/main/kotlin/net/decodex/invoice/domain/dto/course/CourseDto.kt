package net.decodex.invoice.domain.dto.course

import net.decodex.invoice.domain.model.course.Course
import java.util.*

class CourseDto() {
    constructor(course: Course) : this() {
        id = course.id
        name = course.name
        price = course.price
        description = course.description
        certificateField = course.certificateField
        recordBookField = course.recordBookField
        createdAt = course.createdAt
        updatedAt = course.updatedAt
        companyId = course.company.id
    }

    lateinit var name: String
    lateinit var description: String
    lateinit var certificateField: String
    lateinit var recordBookField: String
    var price: Double = 0.0

    lateinit var createdAt: Date
    lateinit var updatedAt: Date
    var id: Long = 0
    var companyId: Long = 0
}