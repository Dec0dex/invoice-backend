package net.decodex.invoice.domain.dao;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import net.decodex.invoice.domain.model.Product;
import net.decodex.invoice.domain.model.QProduct;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long>, QuerydslPredicateExecutor<Product>, QuerydslBinderCustomizer<QProduct> {

    @NotNull
    List<Product> findAll(@Nullable Predicate predicate, Sort sort);

    @Override
    default void customize(QuerydslBindings bindings, @NotNull QProduct root) {
        bindings.bind(String.class)
                .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}