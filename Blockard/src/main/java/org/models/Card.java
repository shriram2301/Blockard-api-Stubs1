package org.models;

public class Card {
	String card_number;
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public boolean isActive_status() {
		return active_status;
	}
	public void setActive_status(boolean active_status) {
		this.active_status = active_status;
	}
	public float getBalance_outstanding() {
		return balance_outstanding;
	}
	public void setBalance_outstanding(float balance_outstanding) {
		this.balance_outstanding = balance_outstanding;
	}
	long cust_id;
	boolean active_status;
	float balance_outstanding;
	String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Card(){}
	public Card(String card_number,long cust_id,String type,boolean active_status,float balance_outstanding)
	{
		this.card_number=card_number;
		this.cust_id=cust_id;
		this.active_status=active_status;
		this.type=type;
		this.balance_outstanding=balance_outstanding;
	}
	

}
