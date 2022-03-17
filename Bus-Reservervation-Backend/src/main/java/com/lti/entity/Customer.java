package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBLCUSTOMER")
public class Customer {

	@Id
	@GeneratedValue

	private int cust_Id;
	private String cust_Name;
	private int cust_Contact;
	private String cust_Email;
	private String username;
	private String password;
	private boolean account_Status;
	
	@OneToMany(mappedBy="customer")
	private List<Booking>bookings;

	public int getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public int getCust_Contact() {
		return cust_Contact;
	}

	public void setCust_Contact(int cust_Contact) {
		this.cust_Contact = cust_Contact;
	}

	public String getCust_Email() {
		return cust_Email;
	}

	public void setCust_Email(String cust_Email) {
		this.cust_Email = cust_Email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAccount_Status() {
		return account_Status;
	}

	public void setAccount_Status(boolean account_Status) {
		this.account_Status = account_Status;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	

	
}
