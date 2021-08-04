package com.example.login.LoginAuthentication.repo;

//import com.example.login.LoginAuthentication.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
//public interface AdminRepo extends JpaRepository<Admin,Integer> {
//    @Transactional
//    @Query(value = "select from admin where employee_id=? and employee_name=? and email_id=?",nativeQuery = true)
//   List<Admin> findByEmployee_idEmployeeNameAndEmail_id(int employee_id, String employee_name, String email_id);
//}
