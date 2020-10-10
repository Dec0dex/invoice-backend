package net.decodex.invoice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lnet/decodex/invoice/services/ProductService;", "", "()V", "clientRepository", "Lnet/decodex/invoice/domain/dao/ClientDao;", "companyRepository", "Lnet/decodex/invoice/domain/dao/CompanyDao;", "productPriceRepository", "Lnet/decodex/invoice/domain/dao/ProductPriceDao;", "productRepository", "Lnet/decodex/invoice/domain/dao/ProductDao;", "uomRepository", "Lnet/decodex/invoice/domain/dao/UnitOfMeasureDao;", "createProduct", "Lnet/decodex/invoice/domain/dto/ProductDto;", "dto", "deleteProductById", "", "id", "", "getProductById", "getProductPriceForClient", "", "productId", "clientId", "getProducts", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateProduct", "invoice-backend"})
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
    @org.springframework.beans.factory.annotation.Autowired()
    private net.decodex.invoice.domain.dao.ClientDao clientRepository;
    
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
    
    public double getProductPriceForClient(long productId, long clientId) {
        return 0.0;
    }
    
    public ProductService() {
        super();
    }
}