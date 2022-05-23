package com.bus_resrvation_dxc.service;

import java.util.List;

import com.bus_resrvation_dxc.entity.Bus;

public interface BusService {

	public List<Bus> fetchBySourceAndDestination(String source,String destination);
	
	public Bus saveBus(Bus bus);
	public List<Bus> fetchBuses();
}
