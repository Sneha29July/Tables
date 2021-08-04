package com.example.login.LoginAuthentication.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.Collection;

public class MyEmployeeDetails extends MyEmployeeDetailsService {
private String userName;
    public MyEmployeeDetails(String userName){
        this.userName=userName;
    }
    public MyEmployeeDetails(){

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));





    }
    @Override
    public String getPassword(){
return  "pass";
    }


    @Override
    public String getUserName(){
return userName;
    }
    @Override
    public boolean isUserExists(){
        return true;


    }
    @Override
    public boolean isEnabled(){
        return true;
    }
}
