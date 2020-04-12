package net.decodex.invoice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lnet/decodex/invoice/services/ProductService;", "", "()V", "companyRepository", "Lnet/decodex/invoice/domain/dao/CompanyDao;", "productPriceRepository", "Lnet/decodex/invoice/domain/dao/ProductPriceDao;", "productRepository", "Lnet/decodex/invoice/domain/dao/ProductDao;", "uomRepository", "Lnet/decodex/invoice/domain/dao/UnitOfMeasureDao;", "createProduct", "Lnet/decodex/invoice/domain/dto/ProductDto;", "dto", "deleteProductById", "", "id", "", "getProductById", "getProducts", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateProduct", "invoice-backend"})
@org.springframework.stereotype.Service()
public class ProductService {
    @org.springframework.beans.factory.annotation.Autowired()
    private net.decodex.invoice.domain.dao.ProductDao productRepository;
    @org.springframework.beans.factory.annotation.Autowired()
    private net.decodex.invoice.domain.dao.CompanyDao companyRepository;
    @org.springframework.beans.factory.annotation.Autowired()
    private net.decodex.invoice.domain.dao.UnitOfMeasureDao uomRepository;
    @org.springframework.beans.factory.annotation.Autowired()
    private net.decodex.invoice.domain.dao.ProductPriceDao productPriceRepository;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ProductDto getProductById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<net.decodex.invoice.domain.dto.ProductDto> getProducts(@org.jetbrains.annotations.Nullable()
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    public void deleteProductById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ProductDto createProduct(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.ProductDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ProductDto updateProduct(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.ProductDto dto, long id) {
        return null;
    }
    
    public ProductService() {
        super();
    }
}