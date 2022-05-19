package com.bus_resrvation_dxc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_resrvation_dxc.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
