package com.luv2code.jsf.jdbc;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String branch;
	private String email;
	private String religion;
	
	public Student() {
	}
	
	public Student(int id, String firstName, String lastName, String branch, String email, String religion) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.email = email;
		this.religion = religion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ",branch=" + branch + ", email=" + email + ", religion=" + religion + "]";
	}

}
