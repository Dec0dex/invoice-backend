package net.decodex.invoice.controlers

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.UserDao
import net.decodex.invoice.domain.dto.UserDto
import net.decodex.invoice.domain.dto.UserRegistrationDto
import net.decodex.invoice.domain.model.User
import net.decodex.invoice.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun getAuthenticatedUserInfo(auth: Authentication): UserDto {
        return userService.getUserByUsername(auth.principal as String)
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): UserDto {
        return userService.getUserById(id)
    }

    @GetMapping("/findAll")
    fun getUsersByPredicate(
        @QuerydslPredicate(
            root = User::class,
            bindings = UserDao::class
        ) predicate: Predicate?
    ): List<UserDto> {
        return userService.getUsersByPredicate(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable id: Long) {
        return userService.deleteUserById(id)
    }

    @PostMapping
    fun createUser(@RequestBody userDto: UserRegistrationDto): UserDto {
        return userService.createUser(userDto)
    }

    @PutMapping("/{id}")
    fun updateUser(
        @PathVariable id: Long, @RequestBody userDto: UserRegistrationDto
    ): UserDto {
        return userService.updateUser(userDto, id)
    }

}