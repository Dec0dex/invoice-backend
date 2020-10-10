package net.decodex.invoice.domain.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lnet/decodex/invoice/domain/dto/CreateInvoiceDto;", "", "()V", "clientId", "", "getClientId", "()J", "setClientId", "(J)V", "companyId", "getCompanyId", "setCompanyId", "dateCreated", "Ljava/util/Date;", "getDateCreated", "()Ljava/util/Date;", "setDateCreated", "(Ljava/util/Date;)V", "dateOfTraffic", "getDateOfTraffic", "setDateOfTraffic", "id", "getId", "setId", "paymentDue", "getPaymentDue", "setPaymentDue", "invoice-backend"})
public final class CreateInvoiceDto {
    private long clientId = 0L;
    private long companyId = 0L;
    private long id = 0L;
    @org.jetbrains.annotations.NotNull()
    public java.util.Date dateCreated;
    @org.jetbrains.annotations.NotNull()
    public java.util.Date dateOfTraffic;
    @org.jetbrains.annotations.NotNull()
    public java.util.Date paymentDue;
    
    public final long getClientId() {
        return 0L;
    }
    
    public final void setClientId(long p0) {
    }
    
    public final long getCompanyId() {
        return 0L;
    }
    
    public final void setCompanyId(long p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
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
    
    public CreateInvoiceDto() {
        super();
    }
}