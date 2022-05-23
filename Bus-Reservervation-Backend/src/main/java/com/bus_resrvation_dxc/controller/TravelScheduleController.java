package com.bus_resrvation_dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus_resrvation_dxc.entity.TravelSchedule;
import com.bus_resrvation_dxc.service.TravelScheduleService;

@RestController
public class TravelScheduleController {
	@Autowired
	private TravelScheduleService scheduleService;
	@PostMapping("/travelschedule")
	public TravelSchedule saveTravelSchedule(TravelSchedule schedule) {
		return scheduleService.savetravelSchedule(schedule);
	}

}
