package com.Multiplex.exceptions;

public class PaymentNotFoundException extends RuntimeException{
	private String message;
	public PaymentNotFoundException(String message) {
		super(message);
		this.message=message;
	}
	public PaymentNotFoundException() {
		
	}

}
