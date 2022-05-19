package com.bus_resrvation_dxc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_resrvation_dxc.entity.SeatMapping;

public interface SeatmappingRepository extends JpaRepository<SeatMapping, Integer> {

}
