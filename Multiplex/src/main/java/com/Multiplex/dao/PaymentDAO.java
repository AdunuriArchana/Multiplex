package com.Multiplex.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Multiplex.entites.Payment;

public interface PaymentDAO extends JpaRepository<Payment,Integer> {

	


}
