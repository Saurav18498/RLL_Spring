package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.PaymentDao;
import com.mph.entity.Payment;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentDao paymentDao;

	@Override
	public Payment getPayment(Payment payment) {
		return paymentDao.getPayment(payment);
		
	}

	@Override
	public List<Payment> getPaymentList() {
		return paymentDao.getPaymentList();
	}

	@Override
	public List<Payment> removePayment(int payment_id) {

		return paymentDao.removePayment(payment_id);
	}

	@Override
	public List<Payment> searchPaymentById(int payment_id) {

		return paymentDao.searchPaymentById(payment_id);
	}

	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
