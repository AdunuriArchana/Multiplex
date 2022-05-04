package com.Multiplex.entites;

//import javax.annotation.Generated;
//import javax.persistence.CascadeType;
import javax.persistence.Column;

//import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="movies")

public class Movies 
{
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int movie_id;
	//private Moviedetails moviedetails;
	//@OneToOne(mappedBy = "mds",cascade = CascadeType.ALL)
	//@JoinColumn(name="movie_id")
	//public Moviedetails getMoviedetails() {
	//	return moviedetails;
	//}
	//public void setMoviedetails(Moviedetails moviedetails) {
	//	this.moviedetails = moviedetails;
	//}
	private  String movie_name;
	
	public Movies(int movie_id,  String movie_name) {
		this.movie_id = movie_id;
		this.movie_name = movie_name;
	}
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name + "]";
	}
}