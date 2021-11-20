package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOOD_MENU")
public class Food {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int f_id;
		
		@Column
		private String f_name;
		@Column
		private String price;
		@Column
		private String total_stock;
		public Food() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Food(int f_id, String f_name, String price, String total_stock) {
			super();
			this.f_id = f_id;
			this.f_name = f_name;
			this.price = price;
			this.total_stock = total_stock;
		}
		public int getF_id() {
			return f_id;
		}
		public void setF_id(int f_id) {
			this.f_id = f_id;
		}
		public String getF_name() {
			return f_name;
		}
		public void setF_name(String f_name) {
			this.f_name = f_name;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getTotal_stock() {
			return total_stock;
		}
		public void setTotal_stock(String total_stock) {
			this.total_stock = total_stock;
		}
		@Override
		public String toString() {
			return "Food [f_id=" + f_id + ", f_name=" + f_name + ", price=" + price + ", total_stock=" + total_stock
					+ "]";
		}
}