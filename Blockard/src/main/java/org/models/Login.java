package org.models;

import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Login {

	String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	String password;

	long phonenumber;

	long cust_id;
public	Login(){}
	public Login(String username,String password,long phonenumber,long custid) {
		this.username=username;
		this.password=password;
		this.phonenumber=phonenumber;
		this.cust_id=custid;
	}
}
