package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LaptopshopApplication {

	public static void main(String[] args) {

		ApplicationContext bxt = SpringApplication.run(LaptopshopApplication.class, args);
		for(String s : bxt.getBeanDefinitionNames()){
			System.out.println(s);
		}
	}
}

