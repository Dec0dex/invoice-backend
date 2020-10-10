package net.decodex.invoice.controlers.course

import com.querydsl.core.types.Predicate
import net.decodex.invoice.domain.dao.course.CourseDao
import net.decodex.invoice.domain.dto.course.CourseDto
import net.decodex.invoice.domain.model.course.Course
import net.decodex.invoice.services.course.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.querydsl.binding.QuerydslPredicate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/course")
class CourseController {

    @Autowired
    lateinit var courseService: CourseService

    @GetMapping("/{id}")
    fun getCourseById(@PathVariable id: Long): CourseDto {
        return courseService.getCourseById(id)
    }

    @GetMapping("/findAll")
    fun getCourses(
        @QuerydslPredicate(
            root = Course::class,
            bindings = CourseDao::class
        ) predicate: Predicate?
    ): List<CourseDto> {
        return courseService.getCourses(predicate)
    }

    @DeleteMapping("/{id}")
    fun deleteCourseById(@PathVariable id: Long) {
        return courseService.deleteCourseById(id)
    }

    @PostMapping
    fun createCourse(@RequestBody courseDto: CourseDto): CourseDto {
        return courseService.createCourse(courseDto)
    }

    @PutMapping
    fun updateCourse(@RequestBody courseDto: CourseDto): CourseDto {
        return courseService.updateCourse(courseDto, courseDto.id)
    }

}