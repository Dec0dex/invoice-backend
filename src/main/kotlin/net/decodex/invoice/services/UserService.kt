package net.decodex.invoice.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import net.decodex.invoice.domain.dao.UserDao
import net.decodex.invoice.domain.dto.UserDto
import net.decodex.invoice.domain.dto.UserRegistrationDto
import net.decodex.invoice.domain.model.User
import net.decodex.invoice.exceptions.ResourceNotFoundException

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserDao

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
        val user = User(
            userDto.username,
            passwordEncoder.encode(userDto.password),
            userDto.email,
            userDto.fullName,
            userDto.dateOfBirth
        )
        return UserDto(userRepository.save(user))
    }

    fun updateUser(userDto: UserRegistrationDto, id: Long): UserDto {
        val user = userRepository.findById(id)

        if (!user.isPresent) {
            throw ResourceNotFoundException()
        }

        user.get().email = userDto.email
        user.get().password = passwordEncoder.encode(userDto.password)

        return UserDto(userRepository.save(user.get()))
    }
}
