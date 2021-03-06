package net.decodex.invoice.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lnet/decodex/invoice/security/ApiUserDetails;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "()V", "userDao", "Lnet/decodex/invoice/domain/dao/UserDao;", "getUserDao", "()Lnet/decodex/invoice/domain/dao/UserDao;", "setUserDao", "(Lnet/decodex/invoice/domain/dao/UserDao;)V", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "invoice-backend"})
@org.springframework.stereotype.Service()
public class ApiUserDetails implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public net.decodex.invoice.domain.dao.UserDao userDao;
    
    @org.jetbrains.annotations.NotNull()
    public net.decodex.invoice.domain.dao.UserDao getUserDao() {
        return null;
    }
    
    public void setUserDao(@org.jetbrains.annotations.NotNull()
    net.decodex.invoice.domain.dao.UserDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    public ApiUserDetails() {
        super();
    }
}