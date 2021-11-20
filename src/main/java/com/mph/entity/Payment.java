package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_DETAILS")
public class Payment implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_id;
	
	@Column
	private String payment_method;
	
	@Column
	private int order_id;
	
	@Column
	private int amount_paid;
	
	@Column
	private String paid_by;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int payment_id, String payment_method, int order_id, int amount_paid, String paid_by) {
		super();
		this.payment_id = payment_id;
		this.payment_method = payment_method;
		this.order_id = order_id;
		this.amount_paid = amount_paid;
		this.paid_by = paid_by;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getAmount_paid() {
		return amount_paid;
	}

	public void setAmount_paid(int amount_paid) {
		this.amount_paid = amount_paid;
	}

	public String getPaid_by() {
		return paid_by;
	}

	public void setPaid_by(String paid_by) {
		this.paid_by = paid_by;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", payment_method=" + payment_method + ", order_id=" + order_id
				+ ", amount_paid=" + amount_paid + ", paid_by=" + paid_by + "]";
	}
	
	
	
	
	
	
	
	
	

}
