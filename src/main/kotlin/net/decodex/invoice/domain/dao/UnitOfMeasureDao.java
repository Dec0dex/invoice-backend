package net.decodex.invoice.domain.dao;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import net.decodex.invoice.domain.model.QUnitOfMeasure;
import net.decodex.invoice.domain.model.UnitOfMeasure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;

public interface UnitOfMeasureDao extends JpaRepository<UnitOfMeasure, Long>, QuerydslPredicateExecutor<UnitOfMeasure>, QuerydslBinderCustomizer<QUnitOfMeasure> {

    @NotNull
    List<UnitOfMeasure> findAll(@Nullable Predicate predicate);

    @Override
    default void customize(QuerydslBindings bindings, @NotNull QUnitOfMeasure root) {
        bindings.bind(String.class)
                .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
