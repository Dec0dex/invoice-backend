package net.decodex.invoice.domain.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u001a\u00109\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001a\u0010<\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010?\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010\u0017\u00a8\u0006B"}, d2 = {"Lnet/decodex/invoice/domain/dto/InvoiceDto;", "", "invoice", "Lnet/decodex/invoice/domain/model/Invoice;", "(Lnet/decodex/invoice/domain/model/Invoice;)V", "()V", "client", "Lnet/decodex/invoice/domain/dto/ClientDto;", "getClient", "()Lnet/decodex/invoice/domain/dto/ClientDto;", "setClient", "(Lnet/decodex/invoice/domain/dto/ClientDto;)V", "company", "Lnet/decodex/invoice/domain/dto/CompanyDto;", "getCompany", "()Lnet/decodex/invoice/domain/dto/CompanyDto;", "setCompany", "(Lnet/decodex/invoice/domain/dto/CompanyDto;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "dateCreated", "getDateCreated", "setDateCreated", "dateOfTraffic", "getDateOfTraffic", "setDateOfTraffic", "id", "", "getId", "()J", "setId", "(J)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "number", "", "getNumber", "()I", "setNumber", "(I)V", "payedAmount", "", "getPayedAmount", "()D", "setPayedAmount", "(D)V", "paymentDue", "getPaymentDue", "setPaymentDue", "remainingAmount", "getRemainingAmount", "setRemainingAmount", "sum", "getSum", "setSum", "updatedAt", "getUpdatedAt", "setUpdatedAt", "invoice-backend"})
public final class InvoiceDto {
    private int number = 0;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public java.util.Date dateCreated;
    @org.jetbrains.annotations.NotNull()
    public java.util.Date dateOfTraffic;
    @org.jetbrains.annotations.NotNull()
    public java.util.Date paymentDue;
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ClientDto client;
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.CompanyDto company;
    private double sum = 0.0;
    private double payedAmount = 0.0;
    private double remainingAmount = 0.0;
    private long id = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date createdAt;
    @org.jetbrains.annotations.Nullable()
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
    public final net.decodex.invoice.domain.dto.ClientDto getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.ClientDto p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.decodex.invoice.domain.dto.CompanyDto getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CompanyDto p0) {
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
    
    public final void setId(long p0) {
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
    
    public InvoiceDto() {
        super();
    }
    
    public InvoiceDto(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.model.Invoice invoice) {
        super();
    }
}