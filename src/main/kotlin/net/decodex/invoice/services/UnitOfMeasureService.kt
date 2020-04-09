package net.decodex.invoice.services

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dao.UnitOfMeasureDao
import net.decodex.invoice.domain.dto.UnitOfMeasureDto
import net.decodex.invoice.domain.model.UnitOfMeasure
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UnitOfMeasureService {

    @Autowired
    lateinit var uomRepository: UnitOfMeasureDao

    @Autowired
    lateinit var companyRepository: CompanyDao

    fun getUnitOfMeasureById(id: Long): UnitOfMeasureDto {
        val uom = uomRepository.findById(id)

        if (!uom.isPresent) {
            throw ResourceNotFoundException()
        }

        return UnitOfMeasureDto(uom.get())
    }

    fun getUnitsOfMeasure(predicate: Predicate?): List<UnitOfMeasureDto> {
        return uomRepository.findAll(predicate).map { UnitOfMeasureDto(it) }
    }

    fun deleteUnitOfMeasureById(id: Long) {
        return uomRepository.deleteById(id)
    }

    fun createUnitOfMeasure(dto: UnitOfMeasureDto): UnitOfMeasureDto {
        val company = companyRepository.findById(dto.companyId)

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        val unitOfMeasure = UnitOfMeasure(dto.name, company.get())
        return UnitOfMeasureDto(uomRepository.save(unitOfMeasure))
    }

    fun updateUnitOfMeasure(dto: UnitOfMeasureDto, id: Long): UnitOfMeasureDto {
        val unitOfMeasure = uomRepository.findById(id)
        val company = companyRepository.findById(dto.companyId)

        if (!unitOfMeasure.isPresent) {
            throw ResourceNotFoundException()
        }

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        unitOfMeasure.get().name = dto.name
        return UnitOfMeasureDto(uomRepository.save(unitOfMeasure.get()))
    }
}