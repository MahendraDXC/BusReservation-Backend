package com.bus_resrvation_dxc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_resrvation_dxc.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByUsername(String username);
}
