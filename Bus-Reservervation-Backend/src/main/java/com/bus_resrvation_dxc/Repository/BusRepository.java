package com.bus_resrvation_dxc.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_resrvation_dxc.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {

	public List<Bus> findBySourceAndDestination(String source,String destination);
}
