package net.decodex.invoice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class Invoice

fun main(args: Array<String>) {
    runApplication<Invoice>(*args)
}
