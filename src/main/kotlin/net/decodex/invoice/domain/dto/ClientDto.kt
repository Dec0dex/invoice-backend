package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.Client
import java.util.*

class ClientDto() {

    constructor(client: Client) : this() {
        name = client.name
        address = client.address
        postalCode = client.postalCode
        city = client.city
        pib = client.pib
        accountNumber = client.accountNumber
        phoneNumber = client.phoneNumber
        email = client.email
        id = client.id
        createdAt = client.createdAt
        updatedAt = client.updatedAt
        companyId = client.company.id
    }

    lateinit var name: String
    lateinit var address: String
    lateinit var postalCode: String
    lateinit var city: String
    lateinit var pib: String

    var accountNumber: String? = null
    var phoneNumber: String? = null
    var email: String? = null

    var id: Long = 0
    var companyId: Long = 0

    var createdAt: Date? = null
    var updatedAt: Date? = null
}