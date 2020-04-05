package net.decodex.invoice.domain.dto

import net.decodex.invoice.domain.model.User
import java.util.*

class UserRegistrationDto() {

    constructor(user: User) : this() {
        username = user.username
        email = user.email
    }

    lateinit var username: String
    lateinit var password: String
    lateinit var email: String
    lateinit var fullName: String

    var dateOfBirth: Date? = null
}