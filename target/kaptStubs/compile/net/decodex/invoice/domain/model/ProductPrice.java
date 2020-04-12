package net.decodex.invoice.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0007H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#\u00a8\u00062"}, d2 = {"Lnet/decodex/invoice/domain/model/ProductPrice;", "", "product", "Lnet/decodex/invoice/domain/model/Product;", "price", "", "discount", "", "quantity", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "(Lnet/decodex/invoice/domain/model/Product;DIIJLjava/util/Date;Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "getDiscount", "()I", "setDiscount", "(I)V", "getId", "()J", "getPrice", "()D", "setPrice", "(D)V", "getProduct", "()Lnet/decodex/invoice/domain/model/Product;", "setProduct", "(Lnet/decodex/invoice/domain/model/Product;)V", "getQuantity", "setQuantity", "getUpdatedAt", "setUpdatedAt", "(Ljava/util/Date;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "invoice-backend"})
@javax.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@javax.persistence.Entity(name = "product_price_table")
public final class ProductPrice {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "product_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Product product;
    private double price;
    private int discount;
    private int quantity;
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
    public final net.decodex.invoice.domain.model.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Product p0) {
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final void setPrice(double p0) {
    }
    
    public final int getDiscount() {
        return 0;
    }
    
    public final void setDiscount(int p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
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
    
    public ProductPrice(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Product product, double price, int discount, int quantity, long id, @org.jetbrains.annotations.NotNull()
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Product component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.ProductPrice copy(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Product product, double price, int discount, int quantity, long id, @org.jetbrains.annotations.NotNull()
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