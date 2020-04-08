package net.decodex.invoice.controlers

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dto.CompanyDto
import net.decodex.invoice.domain.model.Company
import net.decodex.invoice.services.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/company")
class CompanyController {

    @Autowired
    lateinit var companyService: CompanyService

    @GetMapping("/{id}")
    fun getCompanyById(@PathVariable id: Long): CompanyDto {
        return companyService.getCompanyById(id)
    }

    @GetMapping("/findAll")
    fun getCompanies(
        @QuerydslPredicate(
            root = Company::class,
            bindings = CompanyDao::class
        ) predicate: Predicate?
    ): List<CompanyDto> {
        return companyService.getCompanies(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteCompanyById(@PathVariable id: Long) {
        return companyService.deleteCompanyById(id)
    }

    @PostMapping
    fun createCompany(@RequestBody companyDto: CompanyDto): CompanyDto {
        return companyService.createCompany(companyDto)
    }

    @PutMapping
    fun updateCompany(@RequestBody companyDto: CompanyDto): CompanyDto {
        return companyService.updateCompany(companyDto, companyDto.id)
    }

}