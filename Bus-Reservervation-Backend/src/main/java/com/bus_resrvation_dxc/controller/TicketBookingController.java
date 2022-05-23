package com.bus_resrvation_dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus_resrvation_dxc.entity.Bus;
import com.bus_resrvation_dxc.service.BusService;

@RestController
public class TicketBookingController {

	@Autowired
	private BusService busService;

	@PostMapping("/search")
	public List<Bus> fetchBusesByOriginAndDestination(@RequestBody Bus bus) {
		return busService.fetchBySourceAndDestination(bus.getSource(), bus.getDestination());
	}
}
