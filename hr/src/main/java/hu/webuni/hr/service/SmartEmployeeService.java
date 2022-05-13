package hu.webuni.hr.service;

import java.time.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.config.hrConfigurationProperties;
import hu.webuni.hr.model.Employee;

@Service
public class SmartEmployeeService implements EmployeeService{
	
	@Autowired
	hrConfigurationProperties config;

	@Override
	public int getPayRaisePercent(Employee employee) {
		
		LocalDate currentDate = LocalDate.now();
			
		Period period = employee.getHireDate().until(currentDate);
		
		int yearsBetween = period.getYears();
		
		int raisePercent = 0;
		
		// TODO: a listát rendezni tenure csökkenőre
		for (int i=0; i < config.getRaise().getSmart().size(); i++) {
			if (yearsBetween >= config.getRaise().getSmart().get(i).getTenure()) {
				raisePercent = config.getRaise().getSmart().get(i).getPercent();
				break;
			}
		}
		
		return raisePercent;
   
	}

}
