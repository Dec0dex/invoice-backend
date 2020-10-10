package net.decodex.invoice.controlers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u001c\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u001c\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0016\u001a\u00020\u0010H\u0017J\u0012\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u001c\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\u0017J\u0012\u0010 \u001a\u00020\n2\b\b\u0001\u0010!\u001a\u00020\fH\u0017J\u001c\u0010\"\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006#"}, d2 = {"Lnet/decodex/invoice/controlers/InvoiceController;", "", "()V", "invoiceService", "Lnet/decodex/invoice/services/InvoiceService;", "getInvoiceService", "()Lnet/decodex/invoice/services/InvoiceService;", "setInvoiceService", "(Lnet/decodex/invoice/services/InvoiceService;)V", "createInvoice", "Lnet/decodex/invoice/domain/dto/InvoiceDto;", "createDto", "Lnet/decodex/invoice/domain/dto/CreateInvoiceDto;", "createInvoiceProduct", "Lnet/decodex/invoice/domain/dto/InvoiceProductDto;", "id", "", "dto", "Lnet/decodex/invoice/domain/dto/CreateInvoiceProductDto;", "deleteInvoice", "", "deleteInvoiceProduct", "priceId", "getInvoiceById", "getInvoiceProducts", "", "getInvoices", "predicate", "Lcom/querydsl/core/types/Predicate;", "makePayment", "value", "", "updateInvoice", "clientDto", "updateInvoiceProduct", "invoice-backend"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/invoice"})
@org.springframework.web.bind.annotation.RestController()
public class InvoiceController {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.services.InvoiceService invoiceService;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.services.InvoiceService getInvoiceService() {
        return null;
    }
    
    public void setInvoiceService(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.services.InvoiceService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public net.decodex.invoice.domain.dto.InvoiceDto getInvoiceById(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/{id}"})
    public void makePayment(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.springframework.web.bind.annotation.RequestBody()
    double value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}/product"})
    public java.util.List<net.decodex.invoice.domain.dto.InvoiceProductDto> getInvoiceProducts(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/{id}/product"})
    public net.decodex.invoice.domain.dto.InvoiceProductDto createInvoiceProduct(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    net.decodex.invoice.domain.dto.CreateInvoiceProductDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}/product"})
    public net.decodex.invoice.domain.dto.InvoiceProductDto updateInvoiceProduct(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    net.decodex.invoice.domain.dto.CreateInvoiceProductDto dto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}/product/{priceId}"})
    public void deleteInvoiceProduct(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.springframework.web.bind.annotation.PathVariable()
    long priceId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/findAll"})
    public java.util.List<net.decodex.invoice.domain.dto.InvoiceDto> getInvoices(@org.jetbrains.annotations.Nullable()
    @org.springframework.data.querydsl.binding.QuerydslPredicate(root = net.decodex.invoice.domain.model.Invoice.class, bindings = net.decodex.invoice.domain.dao.InvoiceDao.class)
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public void deleteInvoice(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping()
    public net.decodex.invoice.domain.dto.InvoiceDto createInvoice(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    net.decodex.invoice.domain.dto.CreateInvoiceDto createDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping()
    public net.decodex.invoice.domain.dto.InvoiceDto updateInvoice(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    net.decodex.invoice.domain.dto.CreateInvoiceDto clientDto) {
        return null;
    }
    
    public InvoiceController() {
        super();
    }
}