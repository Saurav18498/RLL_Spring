package com.mph.entity;




import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name = "ORDERDETAILS")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;
	
	
	
	@Column
	private String order_item;
	
	
	@Column
	private String quantity;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Order(int order_id, String order_item, String quantity) {
		super();
		this.order_id = order_id;
		this.order_item = order_item;
		this.quantity = quantity;
	}



	public int getOrder_id() {
		return order_id;
	}



	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}



	public String getOrder_item() {
		return order_item;
	}



	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}



	public String getQuantity() {
		return quantity;
	}



	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_item=" + order_item + ", quantity=" + quantity + "]";
	}

}