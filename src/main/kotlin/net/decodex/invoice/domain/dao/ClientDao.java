package net.decodex.invoice.domain.dao;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import net.decodex.invoice.domain.model.Client;
import net.decodex.invoice.domain.model.QClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;

public interface ClientDao extends JpaRepository<Client, Long>, QuerydslPredicateExecutor<Client>, QuerydslBinderCustomizer<QClient> {

    @NotNull
    List<Client> findAll(@Nullable Predicate predicate, Sort sort);

    @Override
    default void customize(QuerydslBindings bindings, @NotNull QClient root) {
        bindings.bind(String.class)
                .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}