package hu.webuni.hr;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.hr.model.Employee;
import hu.webuni.hr.service.SalaryService;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {
		
	@Autowired
	SalaryService salaryService;
	

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}
			
	Employee employee1 = new Employee((long) 1, "Name", "hr", 1000, LocalDate.now().minusYears(12));
	Employee employee2 = new Employee((long) 2, "Name", "hr", 2000, LocalDate.now().minusYears(2));
	
	public void run(String... args) throws Exception {
		
		System.out.println("1 Before: " + employee1.getSalary());
		salaryService.setSalalry(employee1);
		System.out.println("1 After:  " + employee1.getSalary());
		
		System.out.println("2 Before: " + employee2.getSalary());
		salaryService.setSalalry(employee2);
		System.out.println("2 After:  " + employee2.getSalary());
		
	}

	
}
