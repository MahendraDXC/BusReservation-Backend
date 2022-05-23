package com.bus_resrvation_dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus_resrvation_dxc.Repository.BookingRepository;
import com.bus_resrvation_dxc.entity.Booking;
import com.bus_resrvation_dxc.entity.Customer;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;
//	@Autowired(required = true)
//	private Customer customer;
	
	@Autowired
	private CustomerService customerService;
	@Override
	public Booking saveBoooking(Booking booking) {
		
		int c_id = booking.getCust_id();
		
		boolean flag = customerService.fetchCustomerById(c_id).isAccount_Status();
		System.out.println("****************"+flag+"*********************"+booking+"==========="+customerService.fetchCustomerById(c_id));
		if (flag) 
		return bookingRepository.save(booking);
		
		 else {
			 throw new NullPointerException("no data");
//			 return null; 
		 }
			
	}

	@Override
	public List<Booking> fetchBooking() {
		return bookingRepository.findAll();
	}

}
