package com.example.login.LoginAuthentication;

import com.example.login.LoginAuthentication.repo.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.naming.Context;
//@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = EmployeeRepo.class)
public class LoginAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAuthenticationApplication.class, args);
	}




	}

