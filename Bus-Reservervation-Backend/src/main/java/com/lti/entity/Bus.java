package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBLBUS")
public class Bus {
	@Id
	@GeneratedValue
	private int bus_Id;
	private String bus_Name;
	private int bus_Number;
	private String bus_type;
	private String source;
	private String destination;
	private int total_seats;
	
	@ManyToOne
	@JoinColumn(name="adm_id")
	private Admin admin;
	
	@OneToMany(mappedBy="bus")
	private List<TravelSchedule> travelSchedule;

	public int getBus_Id() {
		return bus_Id;
	}

	public void setBus_Id(int bus_Id) {
		this.bus_Id = bus_Id;
	}

	public String getBus_Name() {
		return bus_Name;
	}

	public void setBus_Name(String bus_Name) {
		this.bus_Name = bus_Name;
	}

	public int getBus_Number() {
		return bus_Number;
	}

	public void setBus_Number(int bus_Number) {
		this.bus_Number = bus_Number;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<TravelSchedule> getTravelSchedule() {
		return travelSchedule;
	}

	public void setTravelSchedule(List<TravelSchedule> travelSchedule) {
		this.travelSchedule = travelSchedule;
	}

	
	
	
}
