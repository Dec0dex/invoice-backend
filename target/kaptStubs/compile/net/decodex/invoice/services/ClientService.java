package net.decodex.invoice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lnet/decodex/invoice/services/ClientService;", "", "()V", "clientRepository", "Lnet/decodex/invoice/domain/dao/ClientDao;", "getClientRepository", "()Lnet/decodex/invoice/domain/dao/ClientDao;", "setClientRepository", "(Lnet/decodex/invoice/domain/dao/ClientDao;)V", "companyRepository", "Lnet/decodex/invoice/domain/dao/CompanyDao;", "getCompanyRepository", "()Lnet/decodex/invoice/domain/dao/CompanyDao;", "setCompanyRepository", "(Lnet/decodex/invoice/domain/dao/CompanyDao;)V", "createClient", "Lnet/decodex/invoice/domain/dto/ClientDto;", "clientDto", "deleteClientById", "", "id", "", "getClientById", "getClients", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateClient", "invoice-backend"})
@org.springframework.stereotype.Service()
public class ClientService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.ClientDao clientRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.CompanyDao companyRepository;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.ClientDao getClientRepository() {
        return null;
    }
    
    public void setClientRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.ClientDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.CompanyDao getCompanyRepository() {
        return null;
    }
    
    public void setCompanyRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.CompanyDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ClientDto getClientById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<net.decodex.invoice.domain.dto.ClientDto> getClients(@org.jetbrains.annotations.Nullable()
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    public void deleteClientById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ClientDto createClient(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.ClientDto clientDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.ClientDto updateClient(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.ClientDto clientDto, long id) {
        return null;
    }
    
    public ClientService() {
        super();
    }
}