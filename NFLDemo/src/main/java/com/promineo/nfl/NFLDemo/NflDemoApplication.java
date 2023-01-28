package com.promineo.nfl.NFLDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Steps:
// Spring initializer: Maven, Java, Latest Spring Boot, Jar, 17
// Dependencies: Lombok, Spring Data JDBC, Spring Web, H2 Database, MySQL Driver, Spring Data JPA
//Generate, download zip file
//open projects from file systems
//import

@SpringBootApplication
public class NflDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NflDemoApplication.class, args);
	}

}
