package com.bus_resrvation_dxc.service;

import java.util.List;

import com.bus_resrvation_dxc.entity.Booking;

public interface BookingService {
	public Booking saveBoooking(Booking booking);
	
	public List<Booking> fetchBooking();
	
}
