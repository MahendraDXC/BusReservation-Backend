package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLSEATMAPPING")
public class SeatMapping {
	@Id
	@GeneratedValue
	private int seat_Id;
	private int seat_Number;
	

}
