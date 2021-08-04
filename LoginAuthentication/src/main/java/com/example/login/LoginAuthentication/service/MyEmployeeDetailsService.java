package com.example.login.LoginAuthentication.service;

import com.example.login.LoginAuthentication.entity.Employee;
import com.example.login.LoginAuthentication.security.EmployeeDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public abstract class MyEmployeeDetailsService extends EmployeeDetailsService {
    //@Override
    public EmployeeDetailsService loadUserByUserName(String s)throws UsernameNotFoundException{
        return  new EmployeeDetailsService();
    }

    public abstract Collection<? extends GrantedAuthority> getAuthorities();

    public abstract String getPassword();

    public abstract String getUserName();

    public abstract boolean isUserExists();

    public abstract boolean isEnabled();
}
