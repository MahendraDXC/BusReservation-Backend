package com.bus_resrvation_dxc.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TBLBUS")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bus_Id;
	private String bus_Name;
	private int bus_Number;
	private String bus_type;
	private String source;
	private String pick_up;
	private String destination;
	private String dropping_point;
	private int total_seats;

	@ManyToOne
	@JoinColumn(name="adm_id")
	private Admin admin;
	
	@OneToMany(mappedBy="bus")
	private List<TravelSchedule> travelSchedule;

	
	
	
}
