package com.example.login.LoginAuthentication.service;

import com.example.login.LoginAuthentication.entity.Employee;
import com.example.login.LoginAuthentication.repo.EmployeeRepo;
import com.example.login.LoginAuthentication.security.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public abstract class MyEmployeeDetailsService implements UserDetailsService {

@Autowired
    EmployeeRepo employeeRepo;


    public UserDetails loadUserByUsername(int employee_id) throws UsernameNotFoundException {
       Optional<Employee> employee= employeeRepo.findByEmployeeId(employee_id);

       employee.orElseThrow(()->new UsernameNotFoundException("Not found:"+employee_id));
return     employee.map(MyUserDetails::new).get();
    }
}

