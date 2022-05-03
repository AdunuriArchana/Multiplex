
  package com.Multiplex.service;
  
  import java.util.List;
 
  import com.Multiplex.entites.Booking;
  import com.Multiplex.exceptions.BookingNotFoundException;
  
 
  public interface BookingServices {
  
  public List<Booking> getBooking();
  
  public Booking getBookingById(int book_id) throws BookingNotFoundException;
  
  public Booking addBooking(Booking booking); 
  public void deleteBookingById(int book_id); 
  public Booking updateBooking(Booking booking);
 
  
 }
 