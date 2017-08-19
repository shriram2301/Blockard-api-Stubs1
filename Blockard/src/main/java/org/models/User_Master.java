package org.models;

public class User_Master {

	long custid;
	public long getCustid() {
		return custid;
	}
	public void setCustid(long custid) {
		this.custid = custid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	String first_name;
	String middle_name;
	String last_name;
	String address;
	long phonenumber;
	 public User_Master()
	 {
		 
	 }
	 public User_Master(long custid,String firstname,String middlename,String lastname,long phonenumber,String address)
	 {
		 this.first_name=firstname;
		 this.middle_name=middlename;
		 this.custid=custid;
		 this.last_name=lastname;
		 this.phonenumber=phonenumber;
		 this.address=address;
	 }
}
