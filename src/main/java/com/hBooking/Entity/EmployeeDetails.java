package com.hBooking.Entity;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeList")
public class EmployeeDetails 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false, length=45)
	private String name;
	
	@Column(name="address",nullable=false, length=50)
	private String address;
	
	@Column(name="email",nullable=false, length=50)
	private String email;
	
	@Column(name="contact",nullable=false, length=50)
	private String contact;
	
	@Column(name="qualifications",nullable=false, length=50)
	private String qualifications;
	
	@Column(name="state",nullable=false, length=50)
	private String state;
	
	@Column(name="city",nullable=false, length=50)
	private String city;
	
	@Column(name="dob",nullable=false, length=50)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	private String password;
	
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}