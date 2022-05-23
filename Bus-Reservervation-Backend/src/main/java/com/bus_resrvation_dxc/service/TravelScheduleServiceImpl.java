package com.bus_resrvation_dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus_resrvation_dxc.Repository.TravelScheduleRepository;
import com.bus_resrvation_dxc.entity.TravelSchedule;
@Service
public class TravelScheduleServiceImpl implements TravelScheduleService {
	@Autowired
	private TravelScheduleRepository repository;

	@Override
	public TravelSchedule savetravelSchedule(TravelSchedule schedule) {
		
		return repository.save(schedule);
	}

}
