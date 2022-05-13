package hu.webuni.hr.model;

import java.time.LocalDate;

public class Employee {
	
	private Long id;
	private String name;
	private String position;
	private int salary;
	private LocalDate hireDate;	
	
	public Employee(Long id, String name, String position, int salary, LocalDate hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	

}
