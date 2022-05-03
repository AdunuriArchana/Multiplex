package com.Multiplex.exceptions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException  {
	@Value(value="${data.exception.message1}")
	private String message1;
	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity handleNotFoundException(MovieNotFoundException ex) {
		return new ResponseEntity(message1,HttpStatus.NOT_FOUND);
	}
	
	@Value(value="${data.exception.message2}")
	private String message2;
	@ExceptionHandler(PaymentNotFoundException.class)
	public ResponseEntity handlePaymentNotfoundException(PaymentNotFoundException ex) {
		return new ResponseEntity(message2,HttpStatus.NOT_FOUND);
	}

	@Value(value="${data.exception.message3}")
	private String message3;
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity handleUserNotfoundException(UserNotFoundException ex) {
		return new ResponseEntity(message3,HttpStatus.NOT_FOUND);
	}
	
	  @Value(value="${data.exception.message3}") private String message4;
	  
	  @ExceptionHandler(BookingNotFoundException.class) public ResponseEntity
	  handleBookingNotfoundException(BookingNotFoundException ex) { return new
	 ResponseEntity(message4,HttpStatus.NOT_FOUND); }
	 
}
