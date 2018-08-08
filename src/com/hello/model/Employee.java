package com.hello.model;

import java.util.List;



public class Employee {
	
	
	private Integer empId;
	
	private String firstName;
	
	private String lastName;
	
	private String department;
	
	private String gender;
	
	private List<String> profeciencyIn;
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public List<String> getProfeciencyIn() {
		return profeciencyIn;
	}

	public void setProfeciencyIn(List<String> profeciencyIn) {
		this.profeciencyIn = profeciencyIn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
