package com.bus_resrvation_dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus_resrvation_dxc.entity.Booking;
import com.bus_resrvation_dxc.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/booking")
	public Booking savebooking(@RequestBody Booking booking) {
		return bookingService.saveBoooking(booking);

	}
	@GetMapping("/bookinglist")
	public List<Booking> fetchBookingList() {
		return bookingService.fetchBooking();

	}
}
