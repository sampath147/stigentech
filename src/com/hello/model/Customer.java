package com.hello.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	@Min(value = 10, message="should start from 11")
	@Max(value = 100, message="should be less than 101")
	private Integer id;
	
	@NotNull(message="required")
	@Size(min=3, message="Minimum characters should be 3")
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message="Should be small letters only")
	private String lastName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
