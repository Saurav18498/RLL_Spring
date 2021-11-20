package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMINDETAILS")
public class Admin implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int admin_id;



@Column
private String admin_name;

@Column
private String password;

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(int admin_id, String admin_name, String password) {
	super();
	this.admin_id = admin_id;
	this.admin_name = admin_name;
	this.password = password;
}

public int getAdmin_id() {
	return admin_id;
}

public void setAdmin_id(int admin_id) {
	this.admin_id = admin_id;
}

public String getAdmin_name() {
	return admin_name;
}

public void setAdmin_name(String admin_name) {
	this.admin_name = admin_name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", password=" + password + "]";
}



}
