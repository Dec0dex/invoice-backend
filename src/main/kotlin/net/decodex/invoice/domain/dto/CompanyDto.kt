package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.Company
import java.util.*

class CompanyDto() {

    constructor(company: Company) : this() {
        name = company.name
        address = company.address
        postalCode = company.postalCode
        city = company.city
        pib = company.pib
        registrationNumber = company.registrationNumber
        accountNumber = company.accountNumber
        phoneNumber = company.phoneNumber
        email = company.email
        id = company.id
        createdAt = company.createdAt
        updatedAt = company.updatedAt
    }

    lateinit var name: String
    lateinit var address: String
    lateinit var postalCode: String
    lateinit var city: String
    lateinit var pib: String
    lateinit var registrationNumber: String
    lateinit var accountNumber: String

    var phoneNumber: String? = null
    var email: String? = null

    var id: Long = 0

    var createdAt: Date? = null
    var updatedAt: Date? = null
}