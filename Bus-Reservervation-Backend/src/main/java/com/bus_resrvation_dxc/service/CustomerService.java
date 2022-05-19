package com.bus_resrvation_dxc.service;

import java.util.List;
import java.util.Optional;

import com.bus_resrvation_dxc.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);

	public List<Customer> fetchCustomerList();
	
	public Customer fetchCustomerById(int cust_id);
	
	public Customer fetchCustomerByUsername(String username);
    
}
