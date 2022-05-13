package hu.webuni.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.model.Employee;

@Service
public class SalaryService {
	
	@Autowired
	//@Qualifier("alma")
    EmployeeService employeeService;
	
	public void setSalalry(Employee employee) {
		
		employee.setSalary((int) (employee.getSalary() * (1 +  employeeService.getPayRaisePercent(employee) / 100.0)));
	}

}
