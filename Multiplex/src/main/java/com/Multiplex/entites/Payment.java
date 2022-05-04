package com.Multiplex.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	private int  paymentid;
	private String paymenttype;
	private String  date;
	private String time;
	public Payment(int paymentid, String paymenttype, String date, String time) {
		this.paymentid = paymentid;
		this.paymenttype = paymenttype;
		this.date = date;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", paymenttype=" + paymenttype + ", date=" + date + ", time=" + time
				+ "]";
	}
	@Id
	@Column(name="paymentid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
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
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
}
