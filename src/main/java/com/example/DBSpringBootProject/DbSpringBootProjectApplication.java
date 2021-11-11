package com.example.DBSpringBootProject;

import com.example.DBSpringBootProject.controller.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbSpringBootProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DbSpringBootProjectApplication.class, args);
		Laptop laptop = context.getBean(Laptop.class);
		laptop.showDetails();
		Laptop laptop1 = context.getBean(Laptop.class);
		laptop1.showDetails();
	}

}
