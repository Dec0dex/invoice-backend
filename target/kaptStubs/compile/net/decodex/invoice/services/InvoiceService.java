package net.decodex.invoice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0012J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020.2\u0006\u00104\u001a\u00020.H\u0016J\b\u00105\u001a\u000206H\u0012J\b\u00107\u001a\u000208H\u0012J\u0010\u00109\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020,0;2\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020(0;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010?\u001a\u0002022\u0006\u0010-\u001a\u00020.2\u0006\u0010@\u001a\u00020\"H\u0016J\u0018\u0010A\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u0010B\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006C"}, d2 = {"Lnet/decodex/invoice/services/InvoiceService;", "", "()V", "clientRepository", "Lnet/decodex/invoice/domain/dao/ClientDao;", "getClientRepository", "()Lnet/decodex/invoice/domain/dao/ClientDao;", "setClientRepository", "(Lnet/decodex/invoice/domain/dao/ClientDao;)V", "companyRepository", "Lnet/decodex/invoice/domain/dao/CompanyDao;", "getCompanyRepository", "()Lnet/decodex/invoice/domain/dao/CompanyDao;", "setCompanyRepository", "(Lnet/decodex/invoice/domain/dao/CompanyDao;)V", "invoiceRepository", "Lnet/decodex/invoice/domain/dao/InvoiceDao;", "getInvoiceRepository", "()Lnet/decodex/invoice/domain/dao/InvoiceDao;", "setInvoiceRepository", "(Lnet/decodex/invoice/domain/dao/InvoiceDao;)V", "productPriceRepository", "Lnet/decodex/invoice/domain/dao/ProductPriceDao;", "getProductPriceRepository", "()Lnet/decodex/invoice/domain/dao/ProductPriceDao;", "setProductPriceRepository", "(Lnet/decodex/invoice/domain/dao/ProductPriceDao;)V", "productRepository", "Lnet/decodex/invoice/domain/dao/ProductDao;", "getProductRepository", "()Lnet/decodex/invoice/domain/dao/ProductDao;", "setProductRepository", "(Lnet/decodex/invoice/domain/dao/ProductDao;)V", "calculateProductSum", "", "price", "Lnet/decodex/invoice/domain/model/ProductPrice;", "product", "Lnet/decodex/invoice/domain/model/Product;", "createInvoice", "Lnet/decodex/invoice/domain/dto/InvoiceDto;", "createDto", "Lnet/decodex/invoice/domain/dto/CreateInvoiceDto;", "createInvoiceProduct", "Lnet/decodex/invoice/domain/dto/InvoiceProductDto;", "id", "", "dto", "Lnet/decodex/invoice/domain/dto/CreateInvoiceProductDto;", "deleteInvoiceById", "", "deleteInvoiceProduct", "priceId", "getCurrentYearString", "", "getFirstDayOfYear", "Ljava/util/Date;", "getInvoiceById", "getInvoiceProducts", "", "getInvoices", "predicate", "Lcom/querydsl/core/types/Predicate;", "makePayment", "value", "updateInvoice", "updateInvoiceProduct", "invoice-backend"})
@org.springframework.stereotype.Service()
public class InvoiceService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.InvoiceDao invoiceRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.CompanyDao companyRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.ClientDao clientRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.ProductPriceDao productPriceRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.ProductDao productRepository;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.InvoiceDao getInvoiceRepository() {
        return null;
    }
    
    public void setInvoiceRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.InvoiceDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.CompanyDao getCompanyRepository() {
        return null;
    }
    
    public void setCompanyRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.CompanyDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.ClientDao getClientRepository() {
        return null;
    }
    
    public void setClientRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.ClientDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.ProductPriceDao getProductPriceRepository() {
        return null;
    }
    
    public void setProductPriceRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.ProductPriceDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.ProductDao getProductRepository() {
        return null;
    }
    
    public void setProductRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.ProductDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.InvoiceDto getInvoiceById(long id) {
        return null;
    }
    
    public void makePayment(long id, double value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<net.decodex.invoice.domain.dto.InvoiceDto> getInvoices(@org.jetbrains.annotations.Nullable()
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    public void deleteInvoiceById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<net.decodex.invoice.domain.dto.InvoiceProductDto> getInvoiceProducts(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.InvoiceDto createInvoice(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CreateInvoiceDto createDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.InvoiceDto updateInvoice(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CreateInvoiceDto createDto, long id) {
        return null;
    }
    
    public void deleteInvoiceProduct(long id, long priceId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.InvoiceProductDto createInvoiceProduct(long id, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CreateInvoiceProductDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.InvoiceProductDto updateInvoiceProduct(long id, @org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CreateInvoiceProductDto dto) {
        return null;
    }
    
    private double calculateProductSum(net.decodex.invoice.domain.model.ProductPrice price, net.decodex.invoice.domain.model.Product product) {
        return 0.0;
    }
    
    private java.util.Date getFirstDayOfYear() {
        return null;
    }
    
    private java.lang.String getCurrentYearString() {
        return null;
    }
    
    public InvoiceService() {
        super();
    }
}