package com.bus_resrvation_dxc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TBLTRAVELSCHEDULE")
public class TravelSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int schedule_Id;

//	@JsonFormat(pattern = "yyyy-MM-dd")
	private String schedule_Date;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String departure_Time;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String arrival_Time;

	private double fare_Amount;

	@ManyToOne
	@JoinColumn(name = "bus_id")
	private Bus bus;

}
