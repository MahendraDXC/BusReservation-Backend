package com.bus_resrvation_dxc.entity;

import java.sql.Time;
import java.time.LocalDateTime;

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
	
	
	private LocalDateTime schedule_Date;
	private Time departure_Time;
	private Time arrival_Time;
	private double fare_Amount;
	
	@ManyToOne
	@JoinColumn(name="bus_id")
	private Bus bus;

	
}
