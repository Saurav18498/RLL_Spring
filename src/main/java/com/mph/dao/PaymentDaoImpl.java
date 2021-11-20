package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Payment;


@Repository
public class PaymentDaoImpl implements PaymentDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}


	@Override
	public Payment getPayment(Payment payment) {
		Criteria c = getSession().createCriteria(Payment.class);
		c.add(Restrictions.eq("paid_by", payment.getPaid_by()));
		Payment pay= (Payment)c.uniqueResult();
		
		return pay;
	}


	@Override
	public List<Payment> getPaymentList() {
		Query qry = getSession().createQuery("from Payment");
		List<Payment> paymentlist = qry.list();
		return paymentlist;
		
	}


	@Override
	public List<Payment> removePayment(int payment_id) {
		Query qry = getSession().createQuery("delete Payment where payment_id=:payment_no");		
		qry.setParameter("payment_no", payment_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " + payment_id + "successfully !!!");
		}
		return getPaymentList();
	}


	@Override
	public List<Payment> searchPaymentById(int payment_id) {
		Query query = getSession().createQuery("from Order order where payment_id=:payment_no");
		query.setParameter("payment_no",payment_id);
		List<Payment> paymentlist =query.list();
		System.out.print(paymentlist);
		return paymentlist;
		
	}


	@Override
	public double totalPrice() {
	
		return 0;
	}

	
	
}
