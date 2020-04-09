package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.ClientDao
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dto.ClientDto
import net.decodex.invoice.domain.model.Client
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository: ClientDao
    @Autowired
    lateinit var companyRepository: CompanyDao

    fun getClientById(id: Long): ClientDto {
        val client = clientRepository.findById(id)

        if (!client.isPresent) {
            throw ResourceNotFoundException()
        }

        return ClientDto(client.get())
    }

    fun getClients(predicate: Predicate?): List<ClientDto> {
        return clientRepository.findAll(predicate).map { ClientDto(it) }
    }

    fun deleteClientById(id: Long) {
        return clientRepository.deleteById(id)
    }

    fun createClient(clientDto: ClientDto): ClientDto {
        val company = companyRepository.findById(clientDto.companyId)

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        val client = Client(
            clientDto.name,
            clientDto.address,
            clientDto.postalCode,
            clientDto.city,
            clientDto.pib,
            company.get(),
            clientDto.accountNumber,
            clientDto.phoneNumber,
            clientDto.email
        )
        return ClientDto(clientRepository.save(client))
    }

    fun updateClient(clientDto: ClientDto, id: Long): ClientDto {
        val client = clientRepository.findById(id)
        val company = companyRepository.findById(clientDto.companyId)

        if (!client.isPresent) {
            throw ResourceNotFoundException()
        }

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        client.get().name = clientDto.name
        client.get().address = clientDto.address
        client.get().postalCode = clientDto.postalCode
        client.get().city = clientDto.city
        client.get().pib = clientDto.pib
        client.get().accountNumber = clientDto.accountNumber
        client.get().phoneNumber = clientDto.phoneNumber
        client.get().email = clientDto.email
        client.get().company = company.get()

        return ClientDto(clientRepository.save(client.get()))
    }
}