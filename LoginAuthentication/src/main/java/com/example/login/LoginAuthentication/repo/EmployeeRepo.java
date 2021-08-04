package com.example.login.LoginAuthentication.repo;

import com.example.login.LoginAuthentication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    @Transactional
    @Query(value = "select from employee where employee_id=? and email_id=?",nativeQuery = true)
    List<Employee> findByEmployeeIdEmail_idAndPassword(int employee_id,String email_id,String password);
}
