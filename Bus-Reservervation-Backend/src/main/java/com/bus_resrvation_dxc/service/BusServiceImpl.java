package com.bus_resrvation_dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus_resrvation_dxc.Repository.BusRepository;
import com.bus_resrvation_dxc.entity.Bus;
@Service
public class BusServiceImpl  implements BusService{
	
	@Autowired
	private BusRepository busRepository;
	
	public List<Bus> fetchBySourceAndDestination(String source, String destination) {
		
		return busRepository.findBySourceAndDestination(source , destination);
	}

	@Override
	public Bus saveBus(Bus bus) {
		return busRepository.save(bus);
	}

	@Override
	public List<Bus> fetchBuses() {
		
		return busRepository.findAll();
	}

}
