package net.decodex.invoice.services.course

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.CompanyDao
import net.decodex.invoice.domain.dao.course.CourseDao
import net.decodex.invoice.domain.dto.UnitOfMeasureDto
import net.decodex.invoice.domain.dto.course.CourseDto
import net.decodex.invoice.domain.model.course.Course
import net.decodex.invoice.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CourseService {

    @Autowired
    lateinit var courseRepository: CourseDao

    @Autowired
    lateinit var companyRepository: CompanyDao

    fun getCourseById(id: Long): CourseDto {
        val course = courseRepository.findById(id)

        if (!course.isPresent) {
            throw ResourceNotFoundException()
        }

        return CourseDto(course.get())
    }

    fun getCourses(predicate: Predicate?): List<CourseDto> {
        return courseRepository.findAll(predicate).map { CourseDto(it) }
    }

    fun deleteCourseById(id: Long) {
        return courseRepository.deleteById(id)
    }

    fun createCourse(dto: CourseDto): CourseDto {
        val company = companyRepository.findById(dto.companyId)

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        val course = Course(dto.name, dto.description, dto.certificateField, dto.recordBookField, dto.price, company.get())
        return CourseDto(courseRepository.save(course))
    }

    fun updateCourse(dto: CourseDto, id: Long): CourseDto {
        val course = courseRepository.findById(id)
        val company = companyRepository.findById(dto.companyId)

        if (!course.isPresent) {
            throw ResourceNotFoundException()
        }

        if (!company.isPresent) {
            throw ResourceNotFoundException()
        }

        course.get().name = dto.name
        course.get().description = dto.description
        course.get().certificateField = dto.certificateField
        course.get().recordBookField = dto.recordBookField
        course.get().price = dto.price
        return CourseDto(courseRepository.save(course.get()))
    }
}