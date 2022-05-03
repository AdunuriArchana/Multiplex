package com.Multiplex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Multiplex.entites.Moviedetails;



@Service
public interface MoviedetailsServices {
	public List<Moviedetails> getMoviedetails();
}
