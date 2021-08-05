package com.example.login.LoginAuthentication.repo;

import com.example.login.LoginAuthentication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//@Repository
//@EnableJpaRepositories
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    @Transactional
    @Query(value = "select from employee where employee_id=? ",nativeQuery = true)
    Optional<Employee> findByEmployeeId(int employee_id);
}
