package com.Multiplex.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Multiplex.entites.Payment;
import com.Multiplex.service.PaymentServices;

@RestController
public class PaymentController {
	@Autowired
	PaymentServices paymentService;
	
	@PostMapping("/create")
	public Payment createPayment(@RequestBody Payment payment) {
		 this.paymentService.createPayment(payment);
		return payment;		
}
	@GetMapping("/payment")
	public List<Payment> getPayment() {
		return this.paymentService.getPayment();
	}
	@GetMapping(value="/payment/{paymentid}")
	public ResponseEntity getPaymentByID(@PathVariable ("paymentid") int paymentid) {
		return new ResponseEntity(paymentService.getPaymentByID(paymentid),HttpStatus.OK);
	}
	 
	@PostMapping("/payment")
	public  Payment addpayment(@RequestBody Payment payment) {
		return this.paymentService.addPayment(payment);
	}
	@DeleteMapping("/payment/{paymentid}")
	public void deletePayment(@PathVariable int paymentid) {
		this.paymentService.deletePayment(paymentid);
		
	}
	@PutMapping("/payment")
	public Payment updatePayment(@RequestBody Payment payment) {
		return this.paymentService.updatePayment(payment);
	}


}
