package com.bus_resrvation_dxc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_resrvation_dxc.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
