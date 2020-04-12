package net.decodex.invoice.controlers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0017J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0012\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lnet/decodex/invoice/controlers/ProductController;", "", "()V", "productService", "Lnet/decodex/invoice/services/ProductService;", "getProductService", "()Lnet/decodex/invoice/services/ProductService;", "setProductService", "(Lnet/decodex/invoice/services/ProductService;)V", "createProduct", "Lnet/decodex/invoice/domain/dto/ProductDto;", "productDto", "deleteProductById", "", "id", "", "getProductById", "getProducts", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateProduct", "invoice-backend"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/product"})
@org.springframework.web.bind.annotation.RestController()
public class ProductController {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.services.ProductService productService;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.services.ProductService getProductService() {
        return null;
    }
    
    public void setProductService(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.services.ProductService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public net.decodex.invoice.domain.dto.ProductDto getProductById(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/findAll"})
    public java.util.List<net.decodex.invoice.domain.dto.ProductDto> getProducts(@org.jetbrains.annotations.Nullable()
    @org.springframework.data.querydsl.binding.QuerydslPredicate(root = net.decodex.invoice.domain.model.Product.class, bindings = net.decodex.invoice.domain.dao.ProductDao.class)
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public void deleteProductById(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping()
    public net.decodex.invoice.domain.dto.ProductDto createProduct(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    net.decodex.invoice.domain.dto.ProductDto productDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping()
    public net.decodex.invoice.domain.dto.ProductDto updateProduct(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    net.decodex.invoice.domain.dto.ProductDto productDto) {
        return null;
    }
    
    public ProductController() {
        super();
    }
}