package net.decodex.invoice.domain.dao.course;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import net.decodex.invoice.domain.model.course.Course;
import net.decodex.invoice.domain.model.course.QCourse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;

public interface CourseDao extends JpaRepository<Course, Long>, QuerydslPredicateExecutor<Course>, QuerydslBinderCustomizer<QCourse> {

    @NotNull
    List<Course> findAll(@Nullable Predicate predicate);

    @Override
    default void customize(QuerydslBindings bindings, @NotNull QCourse root) {
        bindings.bind(String.class)
                .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
