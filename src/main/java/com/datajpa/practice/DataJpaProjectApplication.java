
package com.datajpa.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.datajpa.practice.assignment.EmpManager;
import com.datajpa.practice.assignment.Services;

@SpringBootApplication
public class DataJpaProjectApplication {

	public static void main(String[] args) {

		// Start Spring Boot and create the Spring Container
		ApplicationContext context =
				SpringApplication.run(DataJpaProjectApplication.class, args);

		// Get Service object from Spring Container
		Services services = context.getBean(Services.class);

		// Get EmpManager object from Spring Container
		EmpManager manager = context.getBean(EmpManager.class);

		// Start the employee menu
		manager.empManage(services);
	}
}

