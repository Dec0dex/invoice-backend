package net.decodex.invoice.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0019J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0012H\u00c6\u0003J\t\u0010E\u001a\u00020\u0012H\u00c6\u0003J\t\u0010F\u001a\u00020\u0016H\u00c6\u0003J\t\u0010G\u001a\u00020\u0007H\u00c6\u0003J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0007H\u00c6\u0003J\t\u0010M\u001a\u00020\u000bH\u00c6\u0003J\t\u0010N\u001a\u00020\rH\u00c6\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\t\u0010P\u001a\u00020\u0012H\u00c6\u0003J\u009b\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001J\t\u0010V\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010#\"\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010&R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010#\"\u0004\b8\u0010&R$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0014\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010#\"\u0004\bB\u0010&\u00a8\u0006W"}, d2 = {"Lnet/decodex/invoice/domain/model/Invoice;", "", "number", "", "name", "", "dateCreated", "Ljava/util/Date;", "dateOfTraffic", "paymentDue", "company", "Lnet/decodex/invoice/domain/model/Company;", "client", "Lnet/decodex/invoice/domain/model/Client;", "productPrices", "", "Lnet/decodex/invoice/domain/model/ProductPrice;", "sum", "", "payedAmount", "remainingAmount", "id", "", "createdAt", "updatedAt", "(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnet/decodex/invoice/domain/model/Company;Lnet/decodex/invoice/domain/model/Client;Ljava/util/List;DDDJLjava/util/Date;Ljava/util/Date;)V", "getClient", "()Lnet/decodex/invoice/domain/model/Client;", "setClient", "(Lnet/decodex/invoice/domain/model/Client;)V", "getCompany", "()Lnet/decodex/invoice/domain/model/Company;", "setCompany", "(Lnet/decodex/invoice/domain/model/Company;)V", "getCreatedAt", "()Ljava/util/Date;", "getDateCreated", "setDateCreated", "(Ljava/util/Date;)V", "getDateOfTraffic", "setDateOfTraffic", "getId", "()J", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNumber", "()I", "setNumber", "(I)V", "getPayedAmount", "()D", "setPayedAmount", "(D)V", "getPaymentDue", "setPaymentDue", "getProductPrices", "()Ljava/util/List;", "setProductPrices", "(Ljava/util/List;)V", "getRemainingAmount", "setRemainingAmount", "getSum", "setSum", "getUpdatedAt", "setUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "invoice-backend"})
@javax.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@javax.persistence.Entity(name = "invoice_table")
public final class Invoice {
    private int number;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date dateCreated;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date dateOfTraffic;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date paymentDue;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "company_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Company company;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(name = "client_id")
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private net.decodex.invoice.domain.model.Client client;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "invoice", cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<net.decodex.invoice.domain.model.ProductPrice> productPrices;
    private double sum;
    private double payedAmount;
    private double remainingAmount;
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
    
    public final int getNumber() {
        return 0;
    }
    
    public final void setNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateCreated() {
        return null;
    }
    
    public final void setDateCreated(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateOfTraffic() {
        return null;
    }
    
    public final void setDateOfTraffic(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getPaymentDue() {
        return null;
    }
    
    public final void setPaymentDue(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Company getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Company p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Client getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Client p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.ProductPrice> getProductPrices() {
        return null;
    }
    
    public final void setProductPrices(@org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.ProductPrice> p0) {
    }
    
    public final double getSum() {
        return 0.0;
    }
    
    public final void setSum(double p0) {
    }
    
    public final double getPayedAmount() {
        return 0.0;
    }
    
    public final void setPayedAmount(double p0) {
    }
    
    public final double getRemainingAmount() {
        return 0.0;
    }
    
    public final void setRemainingAmount(double p0) {
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
    
    public Invoice(int number, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull()
    java.util.Date dateOfTraffic, @org.jetbrains.annotations.NotNull()
    java.util.Date paymentDue, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Company company, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Client client, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.ProductPrice> productPrices, double sum, double payedAmount, double remainingAmount, long id, @org.jetbrains.annotations.NotNull()
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Company component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Client component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.ProductPrice> component8() {
        return null;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final long component12() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Invoice copy(int number, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull()
    java.util.Date dateOfTraffic, @org.jetbrains.annotations.NotNull()
    java.util.Date paymentDue, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Company company, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Client client, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.ProductPrice> productPrices, double sum, double payedAmount, double remainingAmount, long id, @org.jetbrains.annotations.NotNull()
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