package net.decodex.invoice.domain.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011\u00a8\u00060"}, d2 = {"Lnet/decodex/invoice/domain/dto/ProductDto;", "", "product", "Lnet/decodex/invoice/domain/model/Product;", "(Lnet/decodex/invoice/domain/model/Product;)V", "()V", "companyId", "", "getCompanyId", "()J", "setCompanyId", "(J)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "id", "getId", "setId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "pdv", "", "getPdv", "()I", "setPdv", "(I)V", "price", "", "getPrice", "()D", "setPrice", "(D)V", "unitOfMeasure", "Lnet/decodex/invoice/domain/dto/UnitOfMeasureDto;", "getUnitOfMeasure", "()Lnet/decodex/invoice/domain/dto/UnitOfMeasureDto;", "setUnitOfMeasure", "(Lnet/decodex/invoice/domain/dto/UnitOfMeasureDto;)V", "updatedAt", "getUpdatedAt", "setUpdatedAt", "invoice-backend"})
public final class ProductDto {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.UnitOfMeasureDto unitOfMeasure;
    private double price = 0.0;
    private int pdv = 0;
    private long id = 0L;
    private long companyId = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date createdAt;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date updatedAt;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.dto.UnitOfMeasureDto getUnitOfMeasure() {
        return null;
    }
    
    public final void setUnitOfMeasure(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.UnitOfMeasureDto p0) {
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final void setPrice(double p0) {
    }
    
    public final int getPdv() {
        return 0;
    }
    
    public final void setPdv(int p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getCompanyId() {
        return 0L;
    }
    
    public final void setCompanyId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    public ProductDto() {
        super();
    }
    
    public ProductDto(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Product product) {
        super();
    }
}