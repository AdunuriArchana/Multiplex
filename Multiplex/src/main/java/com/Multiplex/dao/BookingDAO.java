
  package com.Multiplex.dao;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.Multiplex.entites.Booking;
 
  public interface BookingDAO extends JpaRepository<Booking, Integer>{
  
  }
  
 