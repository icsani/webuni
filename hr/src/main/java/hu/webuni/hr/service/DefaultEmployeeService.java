package hu.webuni.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.config.hrConfigurationProperties;
import hu.webuni.hr.model.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService{
	
	@Autowired
	hrConfigurationProperties config;

	@Override
	public int getPayRaisePercent(Employee employee) {
		return config.getRaise().getDef().getPercent();
	}

}
