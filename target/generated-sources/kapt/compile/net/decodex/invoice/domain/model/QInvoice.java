package net.decodex.invoice.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvoice is a Querydsl query type for Invoice
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInvoice extends EntityPathBase<Invoice> {

    private static final long serialVersionUID = -760864108L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInvoice invoice = new QInvoice("invoice");

    public final QClient client;

    public final QCompany company;

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateCreated = createDateTime("dateCreated", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateOfTraffic = createDateTime("dateOfTraffic", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Double> payedAmount = createNumber("payedAmount", Double.class);

    public final DateTimePath<java.util.Date> paymentDue = createDateTime("paymentDue", java.util.Date.class);

    public final ListPath<ProductPrice, QProductPrice> productPrices = this.<ProductPrice, QProductPrice>createList("productPrices", ProductPrice.class, QProductPrice.class, PathInits.DIRECT2);

    public final NumberPath<Double> remainingAmount = createNumber("remainingAmount", Double.class);

    public final NumberPath<Double> sum = createNumber("sum", Double.class);

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QInvoice(String variable) {
        this(Invoice.class, forVariable(variable), INITS);
    }

    public QInvoice(Path<Invoice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QInvoice(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QInvoice(PathMetadata metadata, PathInits inits) {
        this(Invoice.class, metadata, inits);
    }

    public QInvoice(Class<? extends Invoice> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.client = inits.isInitialized("client") ? new QClient(forProperty("client"), inits.get("client")) : null;
        this.company = inits.isInitialized("company") ? new QCompany(forProperty("company")) : null;
    }

}

