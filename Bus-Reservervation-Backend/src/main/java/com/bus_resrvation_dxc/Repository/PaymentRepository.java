package com.bus_resrvation_dxc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_resrvation_dxc.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
