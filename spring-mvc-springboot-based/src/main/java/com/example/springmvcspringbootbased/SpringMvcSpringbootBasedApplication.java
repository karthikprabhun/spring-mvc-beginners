package com.example.springmvcspringbootbased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SpringMvcSpringbootBasedApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringMvcSpringbootBasedApplication.class, args);


	}

}
