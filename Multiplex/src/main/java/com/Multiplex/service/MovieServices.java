package com.Multiplex.service;

import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.http.ResponseEntity;

import com.Multiplex.entites.Movies;

import com.Multiplex.exceptions.MovieNotFoundException;


public interface MovieServices {

	public List<Movies> getMovies();
  
	public Movies getMovieById(int movieid) throws MovieNotFoundException;
	
	public Movies addMovies(Movies movie);
	public void deleteMoviesById(int movieid);
	public Movies updateMovies(Movies movie);
	public List<Movies>getMovieByName();
}