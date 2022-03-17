package com.lti.entity;

import java.sql.Time;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBLTRAVELSCHEDULE")
public class TravelSchedule {
	@Id
	@GeneratedValue
	private int schedule_Id;
	
	
	private LocalDateTime schedule_Date;
	private Time departure_Time;
	private Time arrival_Time;
	private double fare_Amount;
	
	@ManyToOne
	@JoinColumn(name="bus_id")
	private Bus bus;

	public int getSchedule_Id() {
		return schedule_Id;
	}

	public void setSchedule_Id(int schedule_Id) {
		this.schedule_Id = schedule_Id;
	}

	public LocalDateTime getSchedule_Date() {
		return schedule_Date;
	}

	public void setSchedule_Date(LocalDateTime schedule_Date) {
		this.schedule_Date = schedule_Date;
	}

	public Time getDeparture_Time() {
		return departure_Time;
	}

	public void setDeparture_Time(Time departure_Time) {
		this.departure_Time = departure_Time;
	}

	public Time getArrival_Time() {
		return arrival_Time;
	}

	public void setArrival_Time(Time arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

	public double getFare_Amount() {
		return fare_Amount;
	}

	public void setFare_Amount(double fare_Amount) {
		this.fare_Amount = fare_Amount;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	
}
