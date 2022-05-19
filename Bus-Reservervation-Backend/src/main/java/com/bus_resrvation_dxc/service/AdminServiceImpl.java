package com.bus_resrvation_dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus_resrvation_dxc.Repository.AdminRepository;
import com.bus_resrvation_dxc.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> fetchAdminList() {
		
		return adminRepository.findAll();
	}
	

	
	
}
