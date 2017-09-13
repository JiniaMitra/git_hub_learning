package com.paytm;

import java.io.Serializable;

public class Customer implements    Serializable{
String uname;
int amount;
long phone_no;
public Customer(String uname,int amount,long phone_no)
{
	this.uname=uname;
	this.amount=amount;
	this.phone_no=phone_no;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public long getPhone_no() {
	return phone_no;
}
public void setPhone_no(long phone_no) {
	this.phone_no = phone_no;
}
public String toString()
{
	return uname +"  "+amount+"  "+phone_no; 
}
	
}
