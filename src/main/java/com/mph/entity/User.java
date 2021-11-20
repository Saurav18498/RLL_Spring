package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAIL")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column
	 private String userName;
	 
	@Column
	private String email;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String password;
	
	


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String email, String phoneNumber, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + "]";
	}
	
	
}