package net.decodex.invoice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lnet/decodex/invoice/services/CompanyService;", "", "()V", "companyRepository", "Lnet/decodex/invoice/domain/dao/CompanyDao;", "getCompanyRepository", "()Lnet/decodex/invoice/domain/dao/CompanyDao;", "setCompanyRepository", "(Lnet/decodex/invoice/domain/dao/CompanyDao;)V", "createCompany", "Lnet/decodex/invoice/domain/dto/CompanyDto;", "companyDto", "deleteCompanyById", "", "id", "", "getCompanies", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "getCompanyById", "updateCompany", "invoice-backend"})
@org.springframework.stereotype.Service()
public class CompanyService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.CompanyDao companyRepository;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.CompanyDao getCompanyRepository() {
        return null;
    }
    
    public void setCompanyRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.CompanyDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.CompanyDto getCompanyById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<net.decodex.invoice.domain.dto.CompanyDto> getCompanies(@org.jetbrains.annotations.Nullable()
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    public void deleteCompanyById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.CompanyDto createCompany(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CompanyDto companyDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.CompanyDto updateCompany(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.CompanyDto companyDto, long id) {
        return null;
    }
    
    public CompanyService() {
        super();
    }
}