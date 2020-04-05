package net.decodex.invoice.domain.dao

import org.springframework.data.jpa.repository.JpaRepository
import net.decodex.invoice.domain.model.User

interface UserDao : JpaRepository<User, Long> {

    fun findByUsername(username: String): User?

}