package net.decodex.invoice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006&"}, d2 = {"Lnet/decodex/invoice/services/UserService;", "", "()V", "companyRepository", "Lnet/decodex/invoice/domain/dao/CompanyDao;", "getCompanyRepository", "()Lnet/decodex/invoice/domain/dao/CompanyDao;", "setCompanyRepository", "(Lnet/decodex/invoice/domain/dao/CompanyDao;)V", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "getPasswordEncoder", "()Lorg/springframework/security/crypto/password/PasswordEncoder;", "setPasswordEncoder", "(Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "userRepository", "Lnet/decodex/invoice/domain/dao/UserDao;", "getUserRepository", "()Lnet/decodex/invoice/domain/dao/UserDao;", "setUserRepository", "(Lnet/decodex/invoice/domain/dao/UserDao;)V", "createUser", "Lnet/decodex/invoice/domain/dto/UserDto;", "userDto", "Lnet/decodex/invoice/domain/dto/UserRegistrationDto;", "deleteUserById", "", "id", "", "getUserById", "getUserByUsername", "username", "", "getUsersByPredicate", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateUser", "invoice-backend"})
@org.springframework.stereotype.Service()
public class UserService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.UserDao userRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.CompanyDao companyRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.UserDao getUserRepository() {
        return null;
    }
    
    public void setUserRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.UserDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.CompanyDao getCompanyRepository() {
        return null;
    }
    
    public void setCompanyRepository(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.CompanyDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.password.PasswordEncoder getPasswordEncoder() {
        return null;
    }
    
    public void setPasswordEncoder(@org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.password.PasswordEncoder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.UserDto getUserById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.UserDto getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public void deleteUserById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.UserDto createUser(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.UserRegistrationDto userDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<net.decodex.invoice.domain.dto.UserDto> getUsersByPredicate(@org.jetbrains.annotations.Nullable()
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dto.UserDto updateUser(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dto.UserRegistrationDto userDto, long id) {
        return null;
    }
    
    public UserService() {
        super();
    }
}