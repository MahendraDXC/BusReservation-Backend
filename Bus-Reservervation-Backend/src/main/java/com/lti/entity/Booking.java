package com.lti.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Trial Push
@Entity
@Table(name = "TBLBOOKING")
public class Booking {
	@Id
	@GeneratedValue
	private int booking_Id;
	private int number_Of_Seats;
	private double fare_Amount;
	private double total_fare;
	private LocalDateTime date_Of_Booking;
	private boolean booking_Status;
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;

	public int getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(int booking_Id) {
		this.booking_Id = booking_Id;
	}

	public int getNumber_Of_Seats() {
		return number_Of_Seats;
	}

	public void setNumber_Of_Seats(int number_Of_Seats) {
		this.number_Of_Seats = number_Of_Seats;
	}

	public double getFare_Amount() {
		return fare_Amount;
	}

	public void setFare_Amount(double fare_Amount) {
		this.fare_Amount = fare_Amount;
	}

	public double getTotal_fare() {
		return total_fare;
	}

	public void setTotal_fare(double total_fare) {
		this.total_fare = total_fare;
	}

	public LocalDateTime getDate_Of_Booking() {
		return date_Of_Booking;
	}

	public void setDate_Of_Booking(LocalDateTime date_Of_Booking) {
		this.date_Of_Booking = date_Of_Booking;
	}

	public boolean isBooking_Status() {
		return booking_Status;
	}

	public void setBooking_Status(boolean booking_Status) {
		this.booking_Status = booking_Status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	
}
