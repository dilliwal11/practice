package com.example.crudApp;

import com.example.crudApp.model.Employee;
import com.example.crudApp.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		employeeRepo.save(new Employee("abcd", "9876543210", 10, LocalDate.now().minusYears(10l)));
//		employeeRepo.save(new Employee("efgh", "9876543211", 20, LocalDate.now().minusYears(20l)));
//		employeeRepo.save(new Employee("ijkl", "9876543212", 30, LocalDate.now().minusYears(30l)));
//		employeeRepo.save(new Employee("mnop", "9876543213", 40, LocalDate.now().minusYears(40l)));
//	}
}
