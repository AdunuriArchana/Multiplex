package com.Multiplex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Multiplex.dao.BookingDAO;
import com.Multiplex.entites.Booking;
import com.Multiplex.exceptions.BookingNotFoundException;

@Service
public class BookingServicesImpl implements BookingServices {
	@Autowired
	private BookingDAO bookingDao;
	  @Override public List<Booking> getBooking() { // TODO Auto-generated method
	  return bookingDao.findAll();
	  }
	  
	  @Override 
	  public Booking getBookingById(int book_id) throws BookingNotFoundException {
		  // TODO Auto-generated method stub Booking
		  Booking booking;
		  		if(bookingDao.findById(book_id).isEmpty()) {
		  				throw new BookingNotFoundException(); 
		  } else {
			  booking=bookingDao.findById(book_id).get(); 
			  } 
	  return booking;
	  }
	 
	  @Override public Booking addBooking(Booking booking) { // TODO Auto-generated
	  bookingDao.save(booking); 
	  return booking; }
	  
	 @Override public void deleteBookingById(int book_id) { // TODO Auto-generated
		 Booking obj = bookingDao.getById(book_id);
	  bookingDao.delete(obj); 
	  }
	 
	  @Override public Booking updateBooking(Booking booking) { // TODO
	  bookingDao.save(booking); 
	  return booking;
	  } 
}
