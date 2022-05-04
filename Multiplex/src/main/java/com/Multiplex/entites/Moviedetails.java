package com.Multiplex.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="moviedetails")
public class Moviedetails {
	public Moviedetails() {
		super();
		// TODO Auto-generated constructor stub
	}	
	private String date;
	private String time;
	private String language;
	
	private int screen_id;
	public Moviedetails(String date, String time, String language, int screen_id) {
		this.date = date;
		this.time = time;
		this.language = language;
		this.screen_id = screen_id;
		
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
	@Id
	@Column(name="screen_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getScreen_id() {
		return screen_id;
	}
	
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}

	@Override
	public String toString() {
		return "Moviedetails [date=" + date + ", time=" + time + ", language=" + language + ", screen_id=" + screen_id
				+ "]";
	}	
}
