package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dao.UserDao
import net.decodex.invoice.domain.dto.UserDto
import net.decodex.invoice.domain.dto.UserRegistrationDto
import net.decodex.invoice.domain.model.User
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserDao

    @Autowired
    lateinit var companyRepository: CompanyDao

    @Autowired
    lateinit var passwordEncoder: PasswordEncoder

    fun getUserById(id: Long): UserDto {
        val user = userRepository.findById(id)

        if (!user.isPresent) {
            throw ResourceNotFoundException()
        }

        return UserDto(user.get())
    }

    fun getUserByUsername(username: String): UserDto {
        val user = userRepository.findByUsername(username) ?: throw ResourceNotFoundException()

        return UserDto(user)
    }

    fun deleteUserById(id: Long) {
        return userRepository.deleteById(id)
    }

    fun createUser(userDto: UserRegistrationDto): UserDto {
        val company = companyRepository.findById(userDto.companyId)

        val user = User(
            userDto.username,
            passwordEncoder.encode(userDto.password),
            userDto.email,
            userDto.fullName,
            userDto.dateOfBirth,
            company.get()
        )
        return UserDto(userRepository.save(user))
    }

    fun getUsersByPredicate(predicate: Predicate?): List<UserDto> {
        return userRepository.findAll(predicate).map { UserDto(it) }
    }

    fun updateUser(userDto: UserRegistrationDto, id: Long): UserDto {
        val user = userRepository.findById(id)
        val company = companyRepository.findById(userDto.companyId)

        if (!user.isPresent) {
            throw ResourceNotFoundException()
        }

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        user.get().email = userDto.email
        user.get().password = passwordEncoder.encode(userDto.password)
        user.get().company = company.get()
        user.get().fullName = userDto.fullName
        user.get().dateOfBirth = userDto.dateOfBirth

        return UserDto(userRepository.save(user.get()))
    }
}
