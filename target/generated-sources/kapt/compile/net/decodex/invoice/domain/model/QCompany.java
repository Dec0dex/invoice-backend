package net.decodex.invoice.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompany is a Querydsl query type for Company
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompany extends EntityPathBase<Company> {

    private static final long serialVersionUID = -1770578972L;

    public static final QCompany company = new QCompany("company");

    public final StringPath accountNumber = createString("accountNumber");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final ListPath<Client, QClient> clients = this.<Client, QClient>createList("clients", Client.class, QClient.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final StringPath email = createString("email");

    public final ListPath<User, QUser> employes = this.<User, QUser>createList("employes", User.class, QUser.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Invoice, QInvoice> invoices = this.<Invoice, QInvoice>createList("invoices", Invoice.class, QInvoice.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath pib = createString("pib");

    public final StringPath postalCode = createString("postalCode");

    public final ListPath<UnitOfMeasure, QUnitOfMeasure> unitOfMeasures = this.<UnitOfMeasure, QUnitOfMeasure>createList("unitOfMeasures", UnitOfMeasure.class, QUnitOfMeasure.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QCompany(String variable) {
        super(Company.class, forVariable(variable));
    }

    public QCompany(Path<Company> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompany(PathMetadata metadata) {
        super(Company.class, metadata);
    }

}

