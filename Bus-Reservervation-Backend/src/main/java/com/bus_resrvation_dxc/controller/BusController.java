package com.bus_resrvation_dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus_resrvation_dxc.entity.Bus;
import com.bus_resrvation_dxc.service.BusService;

@RestController
public class BusController {
	@Autowired
	private BusService busService;
	@PostMapping("/addbus")
	public Bus saveBus(@RequestBody Bus bus) {
		return busService.saveBus(bus);	
	}
	@GetMapping("/buseslist")
	public List<Bus> fetchBuses(){
		return busService.fetchBuses();
		
	}
}
