package com.mph.service;

import java.util.List;

import com.mph.entity.Payment;

public interface PaymentService {
	
	
	public Payment getPayment(Payment payment);
	public List<Payment> getPaymentList();
	public List<Payment> removePayment(int payment_id);
	public List<Payment> searchPaymentById(int payment_id);
	public double totalPrice();

}
