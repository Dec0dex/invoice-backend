package net.decodex.invoice.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0013J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\t\u00107\u001a\u00020\u000fH\u00c6\u0003J\t\u00108\u001a\u00020\u0011H\u00c6\u0003J\t\u00109\u001a\u00020\u0011H\u00c6\u0003Jk\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u00100\u00a8\u0006@"}, d2 = {"Lnet/decodex/invoice/domain/model/Product;", "", "name", "", "pdv", "", "company", "Lnet/decodex/invoice/domain/model/Company;", "unitOfMeasure", "Lnet/decodex/invoice/domain/model/UnitOfMeasure;", "barcode", "productPrices", "", "Lnet/decodex/invoice/domain/model/ProductPrice;", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "(Ljava/lang/String;ILnet/decodex/invoice/domain/model/Company;Lnet/decodex/invoice/domain/model/UnitOfMeasure;Ljava/lang/String;Ljava/util/List;JLjava/util/Date;Ljava/util/Date;)V", "getBarcode", "()Ljava/lang/String;", "setBarcode", "(Ljava/lang/String;)V", "getCompany", "()Lnet/decodex/invoice/domain/model/Company;", "setCompany", "(Lnet/decodex/invoice/domain/model/Company;)V", "getCreatedAt", "()Ljava/util/Date;", "getId", "()J", "getName", "setName", "getPdv", "()I", "setPdv", "(I)V", "getProductPrices", "()Ljava/util/List;", "setProductPrices", "(Ljava/util/List;)V", "getUnitOfMeasure", "()Lnet/decodex/invoice/domain/model/UnitOfMeasure;", "setUnitOfMeasure", "(Lnet/decodex/invoice/domain/model/UnitOfMeasure;)V", "getUpdatedAt", "setUpdatedAt", "(Ljava/util/Date;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "invoice-backend"})
@javax.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@javax.persistence.Entity(name = "product_table")
public final class Product {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private int pdv;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "company_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Company company;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "unit_of_measure_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.UnitOfMeasure unitOfMeasure;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String barcode;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "product", cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<net.decodex.invoice.domain.model.ProductPrice> productPrices;
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.annotation.CreatedDate()
    @javax.persistence.Column(name = "created_at", nullable = false, updatable = false)
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    private final java.util.Date createdAt = null;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.annotation.LastModifiedDate()
    @javax.persistence.Column(name = "updated_at")
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPdv() {
        return 0;
    }
    
    public final void setPdv(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Company getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Company p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.UnitOfMeasure getUnitOfMeasure() {
        return null;
    }
    
    public final void setUnitOfMeasure(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.UnitOfMeasure p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBarcode() {
        return null;
    }
    
    public final void setBarcode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.ProductPrice> getProductPrices() {
        return null;
    }
    
    public final void setProductPrices(@org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.ProductPrice> p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public Product(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int pdv, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Company company, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.UnitOfMeasure unitOfMeasure, @org.jetbrains.annotations.Nullable()
    java.lang.String barcode, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.ProductPrice> productPrices, long id, @org.jetbrains.annotations.NotNull()
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Company component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.UnitOfMeasure component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.ProductPrice> component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Product copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int pdv, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Company company, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.UnitOfMeasure unitOfMeasure, @org.jetbrains.annotations.Nullable()
    java.lang.String barcode, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.ProductPrice> productPrices, long id, @org.jetbrains.annotations.NotNull()
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}