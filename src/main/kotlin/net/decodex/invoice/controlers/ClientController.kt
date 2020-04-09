package net.decodex.invoice.controlers

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.ClientDao
import net.decodex.invoice.domain.dto.ClientDto
import net.decodex.invoice.domain.model.Client
import net.decodex.invoice.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/client")
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping("/{id}")
    fun getClientById(@PathVariable id: Long): ClientDto {
        return clientService.getClientById(id)
    }

    @GetMapping("/findAll")
    fun getClients(
        @QuerydslPredicate(
            root = Client::class,
            bindings = ClientDao::class
        ) predicate: Predicate?
    ): List<ClientDto> {
        return clientService.getClients(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteClientById(@PathVariable id: Long) {
        return clientService.deleteClientById(id)
    }

    @PostMapping
    fun createClient(@RequestBody clientDto: ClientDto): ClientDto {
        return clientService.createClient(clientDto)
    }

    @PutMapping
    fun updateClient(@RequestBody clientDto: ClientDto): ClientDto {
        return clientService.updateClient(clientDto, clientDto.id)
    }

}