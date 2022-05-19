package com.bus_resrvation_dxc.service;

import java.util.List;

import com.bus_resrvation_dxc.entity.Admin;

public interface AdminService {
	public Admin saveAdmin(Admin admin);

	public List<Admin> fetchAdminList();
}
