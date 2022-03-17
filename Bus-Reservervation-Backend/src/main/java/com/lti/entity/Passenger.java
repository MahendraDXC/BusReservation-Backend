package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBLPASSENGER")
public class Passenger {
	@Id
	@GeneratedValue
	private int pass_Id;
	private String pass_Name;
	private int pass_Age;
	private String pass_Gender;
	
	@OneToOne
	@JoinColumn(name="booking_id")
	private Booking booking;
	
	@OneToOne
	@JoinColumn(name="seat_id")
	private SeatMapping seatMapping;

	public int getPass_Id() {
		return pass_Id;
	}

	public void setPass_Id(int pass_Id) {
		this.pass_Id = pass_Id;
	}

	public String getPass_Name() {
		return pass_Name;
	}

	public void setPass_Name(String pass_Name) {
		this.pass_Name = pass_Name;
	}

	public int getPass_Age() {
		return pass_Age;
	}

	public void setPass_Age(int pass_Age) {
		this.pass_Age = pass_Age;
	}

	public String getPass_Gender() {
		return pass_Gender;
	}

	public void setPass_Gender(String pass_Gender) {
		this.pass_Gender = pass_Gender;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public SeatMapping getSeatMapping() {
		return seatMapping;
	}

	public void setSeatMapping(SeatMapping seatMapping) {
		this.seatMapping = seatMapping;
	}

	
	
	
	
}
