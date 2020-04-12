package net.decodex.invoice.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ab\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0019J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u00c6\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u00c6\u0003J\t\u0010B\u001a\u00020\u0017H\u00c6\u0003J\t\u0010C\u001a\u00020\u0017H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\fH\u00c6\u0003J\u00bb\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u00c6\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010P\u001a\u00020QH\u00d6\u0001J\t\u0010R\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\u001e\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\'\"\u0004\b;\u0010<\u00a8\u0006S"}, d2 = {"Lnet/decodex/invoice/domain/model/Company;", "", "name", "", "address", "postalCode", "city", "pib", "accountNumber", "phoneNumber", "email", "id", "", "employes", "", "Lnet/decodex/invoice/domain/model/User;", "unitOfMeasures", "Lnet/decodex/invoice/domain/model/UnitOfMeasure;", "clients", "Lnet/decodex/invoice/domain/model/Client;", "invoices", "Lnet/decodex/invoice/domain/model/Invoice;", "createdAt", "Ljava/util/Date;", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getAddress", "setAddress", "getCity", "setCity", "getClients", "()Ljava/util/List;", "setClients", "(Ljava/util/List;)V", "getCreatedAt", "()Ljava/util/Date;", "getEmail", "setEmail", "getEmployes", "setEmployes", "getId", "()J", "getInvoices", "setInvoices", "getName", "setName", "getPhoneNumber", "setPhoneNumber", "getPib", "setPib", "getPostalCode", "setPostalCode", "getUnitOfMeasures", "setUnitOfMeasures", "getUpdatedAt", "setUpdatedAt", "(Ljava/util/Date;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "invoice-backend"})
@javax.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@javax.persistence.Entity(name = "company_table")
public final class Company {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String postalCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String city;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(unique = true)
    private java.lang.String pib;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(unique = true)
    private java.lang.String accountNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "company", cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<net.decodex.invoice.domain.model.User> employes;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "company", cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<net.decodex.invoice.domain.model.UnitOfMeasure> unitOfMeasures;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "company", cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<net.decodex.invoice.domain.model.Client> clients;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "company", cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
    private java.util.List<net.decodex.invoice.domain.model.Invoice> invoices;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    public final void setPostalCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPib() {
        return null;
    }
    
    public final void setPib(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountNumber() {
        return null;
    }
    
    public final void setAccountNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.User> getEmployes() {
        return null;
    }
    
    public final void setEmployes(@org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.UnitOfMeasure> getUnitOfMeasures() {
        return null;
    }
    
    public final void setUnitOfMeasures(@org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.UnitOfMeasure> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.Client> getClients() {
        return null;
    }
    
    public final void setClients(@org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.Client> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.Invoice> getInvoices() {
        return null;
    }
    
    public final void setInvoices(@org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.Invoice> p0) {
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
    
    public Company(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String pib, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String email, long id, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.User> employes, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.UnitOfMeasure> unitOfMeasures, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.Client> clients, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.Invoice> invoices, @org.jetbrains.annotations.NotNull()
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.User> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.UnitOfMeasure> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.Client> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.decodex.invoice.domain.model.Invoice> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.model.Company copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String pib, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String email, long id, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.User> employes, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.UnitOfMeasure> unitOfMeasures, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.Client> clients, @org.jetbrains.annotations.NotNull()
    java.util.List<net.decodex.invoice.domain.model.Invoice> invoices, @org.jetbrains.annotations.NotNull()
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