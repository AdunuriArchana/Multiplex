package com.Multiplex.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
	@Table(name="book_Ticket")

	public class Booking {
		public Booking() {
			super();
		}
			
		private int book_id;
		private int seats;
		private String date;
		private String time;
		private int user_id;
		private int movie_id;
	
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="movie_id")
		List<Users>users;
		

		public Booking(int book_id, int seats, String date, String time,int user_id,int movie_id,String email_id) {
			super();
			this.book_id = book_id;
			this.seats = seats;
			this.date = date;
			this.time = time;
			this.user_id=user_id;
			this.movie_id=movie_id;
		}
		
		@Override
		public String toString() {
			return "Booking [book_id=" + book_id + ", seats=" + seats + ", date=" + date + ", time=" + time + ", user_id=" + user_id +", movie_id=" + movie_id + "]";
		}
		@Id
		@Column(name="book_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		public int getBook_id() {
			return book_id;
		}
		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}
		public int getSeats() {
			return seats;
		}
		public void setSeats(int seats) {
			this.seats = seats;
		}
		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		public int getMovie_id() {
			return movie_id;
		}

		public void setMovie_id(int movie_id) {
			this.movie_id = movie_id;
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
	}

