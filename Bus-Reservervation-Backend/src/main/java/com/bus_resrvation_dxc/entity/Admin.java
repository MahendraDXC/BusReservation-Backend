package com.bus_resrvation_dxc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "TBLADMIN")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adm_id;
	private String adm_name;
	private String adm_contact;
	private String adm_email;
	private String username;//My password
	private String password;

	@OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
	private List<Bus> buses;

	


	
	

	

}
