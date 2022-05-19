package com.bus_resrvation_dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus_resrvation_dxc.Repository.CustomerRepository;
import com.bus_resrvation_dxc.entity.Customer;
@Service
public class CustomerserviceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> fetchCustomerList() {
		return customerRepository.findAll();
	}

	@Override
	public Customer fetchCustomerById(int cust_id) {
		
		return customerRepository.findById(cust_id).get();
	}

	@Override
	public Customer fetchCustomerByUsername(String username) {
		return customerRepository.findByUsername(username);
	}

}
