package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dto.CompanyDto
import net.decodex.invoice.domain.model.Company
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService {

    @Autowired
    lateinit var companyRepository: CompanyDao

    fun getCompanyById(id: Long): CompanyDto {
        val company = companyRepository.findById(id)

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        return CompanyDto(company.get())
    }

    fun getCompanies(predicate: Predicate?): List<CompanyDto> {
        return companyRepository.findAll(predicate).map { CompanyDto(it) }
    }

    fun deleteCompanyById(id: Long) {
        return companyRepository.deleteById(id)
    }

    fun createCompany(companyDto: CompanyDto): CompanyDto {
        val company = Company(
            companyDto.name,
            companyDto.address,
            companyDto.postalCode,
            companyDto.city,
            companyDto.pib,
            companyDto.registrationNumber,
            companyDto.accountNumber,
            companyDto.phoneNumber,
            companyDto.email
        )
        return CompanyDto(companyRepository.save(company))
    }

    fun updateCompany(companyDto: CompanyDto, id: Long): CompanyDto {
        val company = companyRepository.findById(id)

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        company.get().name = companyDto.name
        company.get().address = companyDto.address
        company.get().postalCode = companyDto.postalCode
        company.get().city = companyDto.city
        company.get().pib = companyDto.pib
        company.get().registrationNumber = companyDto.registrationNumber
        company.get().accountNumber = companyDto.accountNumber
        company.get().phoneNumber = companyDto.phoneNumber
        company.get().email = companyDto.email

        return CompanyDto(companyRepository.save(company.get()))
    }
}