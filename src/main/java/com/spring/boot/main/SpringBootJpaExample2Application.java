package com.spring.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.spring.boot")
@EntityScan("com.spring.boot.model")
@EnableJpaRepositories("com.spring.boot.repository")
public class SpringBootJpaExample2Application {

//	Example of 2 Entity Table Repository and data fetch 
//	Run this class and hit localhost:8081/ 
//	you can get the port no from application.properties
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExample2Application.class, args);
	}

}
