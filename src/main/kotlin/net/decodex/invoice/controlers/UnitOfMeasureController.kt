package net.decodex.invoice.controlers

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.UnitOfMeasureDao
import net.decodex.invoice.domain.dto.UnitOfMeasureDto
import net.decodex.invoice.domain.model.UnitOfMeasure
import net.decodex.invoice.services.UnitOfMeasureService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/uom")
class UnitOfMeasureController {

    @Autowired
    lateinit var uomService: UnitOfMeasureService

    @GetMapping("/{id}")
    fun getUnitOfMeasureById(@PathVariable id: Long): UnitOfMeasureDto {
        return uomService.getUnitOfMeasureById(id)
    }

    @GetMapping("/findAll")
    fun getUnitsOfMeasure(
        @QuerydslPredicate(
            root = UnitOfMeasure::class,
            bindings = UnitOfMeasureDao::class
        ) predicate: Predicate?
    ): List<UnitOfMeasureDto> {
        return uomService.getUnitsOfMeasure(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteUnitOfMeasureById(@PathVariable id: Long) {
        return uomService.deleteUnitOfMeasureById(id)
    }

    @PostMapping
    fun createUnitOfMeasure(@RequestBody uomDto: UnitOfMeasureDto): UnitOfMeasureDto {
        return uomService.createUnitOfMeasure(uomDto)
    }

    @PutMapping
    fun updateUnitOfMeasure(@RequestBody uomDto: UnitOfMeasureDto): UnitOfMeasureDto {
        return uomService.updateUnitOfMeasure(uomDto, uomDto.id)
    }

}