package com.Multiplex.service;

import java.util.List;

import com.Multiplex.entites.Payment;
import com.Multiplex.exceptions.PaymentNotFoundException;

public interface PaymentServices {
	public Payment createPayment(Payment payment);
	public List<Payment> getPayment();
	
	public Payment getPaymentByID(int payment_id) throws PaymentNotFoundException;
	public Payment addPayment(Payment payment);
	public void deletePayment(int payment_id);
	Payment updatePayment(Payment payment);

}
