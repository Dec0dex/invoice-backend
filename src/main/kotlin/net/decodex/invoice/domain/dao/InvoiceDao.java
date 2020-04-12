package net.decodex.invoice.domain.dao;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import net.decodex.invoice.domain.model.Invoice;
import net.decodex.invoice.domain.model.QInvoice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.Date;
import java.util.List;

public interface InvoiceDao extends JpaRepository<Invoice, Long>, QuerydslPredicateExecutor<Invoice>, QuerydslBinderCustomizer<QInvoice> {

    @NotNull
    List<Invoice> findAll(@Nullable Predicate predicate);

    @NotNull
    List<Invoice> findAllByCreatedAtAfter(Date date);

    @Override
    default void customize(QuerydslBindings bindings, @NotNull QInvoice root) {
        bindings.bind(String.class)
                .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}