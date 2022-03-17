package com.lti.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBLPAYMENT")
public class Payment {
	@Id
	@GeneratedValue
	private int payment_Id;
	private double amount_Paid;
	private LocalDateTime payment_Date;
	
	@OneToOne
	@JoinColumn(name="booking_id")
	private Booking booking;

	public int getPayment_Id() {
		return payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		this.payment_Id = payment_Id;
	}

	public double getAmount_Paid() {
		return amount_Paid;
	}

	public void setAmount_Paid(double amount_Paid) {
		this.amount_Paid = amount_Paid;
	}

	public LocalDateTime getPayment_Date() {
		return payment_Date;
	}

	public void setPayment_Date(LocalDateTime payment_Date) {
		this.payment_Date = payment_Date;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	
	
	
}
