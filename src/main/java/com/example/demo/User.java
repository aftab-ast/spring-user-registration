package com.example.demo;

import java.sql.Date;
public class User {
	
	private String Name;
	private String email;
	private String password;
	private Date birthDate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "User [Name=" + Name + ", Email=" + email + ", Password=" + password + ", BirthDate=" + birthDate + "]";
	}
}
