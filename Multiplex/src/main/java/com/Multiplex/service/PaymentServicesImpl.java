package com.Multiplex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Multiplex.dao.PaymentDAO;
import com.Multiplex.entites.Payment;
import com.Multiplex.exceptions.PaymentNotFoundException;

@Service
public class PaymentServicesImpl implements PaymentServices{
	@Autowired
	private PaymentDAO paymentDao;
	

@Override
	public Payment createPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.save(payment);
	return payment;
}

	@Override
	public List<Payment> getPayment() {
		// TODO Auto-generated method stub
		return paymentDao.findAll();
	}

	@Override
	public Payment getPaymentByID(int paymentid) throws PaymentNotFoundException {
		Payment payment;
		if(paymentDao.findById(paymentid).isEmpty()) {
			throw new PaymentNotFoundException();
		}
		else {
			payment=paymentDao.findById(paymentid).get();
		}
		// TODO Auto-generated method stub
		return payment;
	}
	

	@Override
	public Payment addPayment(Payment payment) {
		//TODO Auto-generated method stub
		 paymentDao.save(payment);
		 return payment;
	}

	@Override
	public void deletePayment(int payment_id) {
		// TODO Auto-generated method stub
		Payment obj = paymentDao.getById(payment_id);
		paymentDao.delete(obj);
	}

	@Override
	public Payment updatePayment(Payment payment) {
	// TODO Auto-generated method stub
		paymentDao.save(payment);
	return payment;
}

}
