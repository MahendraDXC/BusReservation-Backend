package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBLADMIN")//demo push
public class Admin {
	@Id
	@GeneratedValue
	private int adm_id;
	private String adm_name;
	private String adm_contact;
	private String adm_email;
	private String username;
	private String password;

	@OneToMany(mappedBy = "admin")
	private List<Bus> buses;

	

	public int getAdm_id() {
		return adm_id;
	}

	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public String getAdm_name() {
		return adm_name;
	}

	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}

	public String getAdm_contact() {
		return adm_contact;
	}

	public void setAdm_contact(String adm_contact) {
		this.adm_contact = adm_contact;
	}

	public String getAdm_email() {
		return adm_email;
	}

	public void setAdm_email(String adm_email) {
		this.adm_email = adm_email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

	
	

	

}
