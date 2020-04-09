package net.decodex.invoice.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUnitOfMeasure is a Querydsl query type for UnitOfMeasure
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUnitOfMeasure extends EntityPathBase<UnitOfMeasure> {

    private static final long serialVersionUID = 806776970L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUnitOfMeasure unitOfMeasure = new QUnitOfMeasure("unitOfMeasure");

    public final QCompany company;

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QUnitOfMeasure(String variable) {
        this(UnitOfMeasure.class, forVariable(variable), INITS);
    }

    public QUnitOfMeasure(Path<UnitOfMeasure> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUnitOfMeasure(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUnitOfMeasure(PathMetadata metadata, PathInits inits) {
        this(UnitOfMeasure.class, metadata, inits);
    }

    public QUnitOfMeasure(Class<? extends UnitOfMeasure> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.company = inits.isInitialized("company") ? new QCompany(forProperty("company")) : null;
    }

}

