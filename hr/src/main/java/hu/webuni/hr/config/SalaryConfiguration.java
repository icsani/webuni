package hu.webuni.hr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.service.EmployeeService;
import hu.webuni.hr.service.DefaultEmployeeService;

@Configuration
@Profile("!prod")
public class SalaryConfiguration {
	@Bean
	public EmployeeService employeeService() {
		return new DefaultEmployeeService();
	}

}
