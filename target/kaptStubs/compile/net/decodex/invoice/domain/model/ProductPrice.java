package net.decodex.invoice.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0013J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0011H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010:\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010<\u001a\u00020\u000fH\u00c6\u0003J\t\u0010=\u001a\u00020\u0011H\u00c6\u0003J|\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0007H\u00d6\u0001J\t\u0010D\u001a\u00020EH\u00d6\u0001R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001e\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u00103\u00a8\u0006F"}, d2 = {"Lnet/decodex/invoice/domain/model/ProductPrice;", "", "product", "Lnet/decodex/invoice/domain/model/Product;", "price", "", "discount", "", "quantity", "number", "invoice", "Lnet/decodex/invoice/domain/model/Invoice;", "client", "Lnet/decodex/invoice/domain/model/Client;", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "(Lnet/decodex/invoice/domain/model/Product;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lnet/decodex/invoice/domain/model/Invoice;Lnet/decodex/invoice/domain/model/Client;JLjava/util/Date;Ljava/util/Date;)V", "getClient", "()Lnet/decodex/invoice/domain/model/Client;", "setClient", "(Lnet/decodex/invoice/domain/model/Client;)V", "getCreatedAt", "()Ljava/util/Date;", "getDiscount", "()Ljava/lang/Integer;", "setDiscount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "()J", "getInvoice", "()Lnet/decodex/invoice/domain/model/Invoice;", "setInvoice", "(Lnet/decodex/invoice/domain/model/Invoice;)V", "getNumber", "setNumber", "getPrice", "()D", "setPrice", "(D)V", "getProduct", "()Lnet/decodex/invoice/domain/model/Product;", "setProduct", "(Lnet/decodex/invoice/domain/model/Product;)V", "getQuantity", "setQuantity", "getUpdatedAt", "setUpdatedAt", "(Ljava/util/Date;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lnet/decodex/invoice/domain/model/Product;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lnet/decodex/invoice/domain/model/Invoice;Lnet/decodex/invoice/domain/model/Client;JLjava/util/Date;Ljava/util/Date;)Lnet/decodex/invoice/domain/model/ProductPrice;", "equals", "", "other", "hashCode", "toString", "", "invoice-backend"})
@javax.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@javax.persistence.Entity(name = "product_price_table")
public final class ProductPrice {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "product_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Product product;
    private double price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer discount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer quantity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer number;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "invoice_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Invoice invoice;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "client_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Client client;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.decodex.invoice.domain.model.Invoice getInvoice() {
        return null;
    }
    
    public final void setInvoice(@org.jetbrains.annotations.Nullable()
    net.decodex.invoice.domain.model.Invoice p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.decodex.invoice.domain.model.Client getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.Nullable()
    net.decodex.invoice.domain.model.Client p0) {
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
    net.decodex.invoice.domain.model.Product product, double price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer number, @org.jetbrains.annotations.Nullable()
    net.decodex.invoice.domain.model.Invoice invoice, @org.jetbrains.annotations.Nullable()
    net.decodex.invoice.domain.model.Client client, long id, @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.decodex.invoice.domain.model.Invoice component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.decodex.invoice.domain.model.Client component7() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.ProductPrice copy(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Product product, double price, @org.jetbrains.annotations.Nullable()
    java.lang.Integer discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer number, @org.jetbrains.annotations.Nullable()
    net.decodex.invoice.domain.model.Invoice invoice, @org.jetbrains.annotations.Nullable()
    net.decodex.invoice.domain.model.Client client, long id, @org.jetbrains.annotations.NotNull()
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