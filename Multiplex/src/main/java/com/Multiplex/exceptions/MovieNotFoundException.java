package com.Multiplex.exceptions;

public class MovieNotFoundException extends RuntimeException{
	private String message;
	public MovieNotFoundException (String message) {
		super(message);
		this.message=message;
	}
	public MovieNotFoundException() {
		
	}
}