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
@Table(name="movie")

public class Movies 
{
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int movie_id;
	private  String movie_name;
	private String date;
	private String time;
	private String language;
	
	public Movies(int movie_id,  String movie_name,String date, String time, String language) {
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.date = date;
		this.time = time;
		this.language = language;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name + ", date=" + date + ", time=" + time
				+ ", language=" + language + "]";
	}
	
//	public String toString() {
//		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name + "]";
//	}
}