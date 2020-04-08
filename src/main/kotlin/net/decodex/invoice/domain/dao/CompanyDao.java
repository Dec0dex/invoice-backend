package net.decodex.invoice.domain.dao;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import net.decodex.invoice.domain.model.Company;
import net.decodex.invoice.domain.model.QCompany;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;

public interface CompanyDao extends JpaRepository<Company, Long>, QuerydslPredicateExecutor<Company>, QuerydslBinderCustomizer<QCompany> {

    @NotNull
    List<Company> findAll(@Nullable Predicate predicate);

    @Override
    default void customize(QuerydslBindings bindings, @NotNull QCompany root) {
        bindings.bind(String.class)
                .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
