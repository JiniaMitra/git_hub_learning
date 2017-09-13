package com.paytm;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class TestPaytm {
	ArrayList<Customer> als2=null;
public static void main(String[] args) throws IOException {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter mobile");
	long mob=sc.nextLong();
	CustomerPerform cp=new CustomerPerform();
int res=cp.adding(mob);
if(res==1)
{
	System.out.println("enter 1 to check balance 2 to add amount enter 3 to recharge");
	int ch=sc.nextInt();
	if(ch==1)
cp.checkBalance(9038);
	if(ch==2)
	{
		System.out.println("enter amount");
		int amt=sc.nextInt();
		cp.addAmount(amt, mob);
	}
	if(ch==3)
	{
		System.out.println("type Airtel or Vodafone");
	String operator=sc.next();
	int amt=0;
	switch(operator)
	{
	
	case "airtel":
	case "Airtel":
		System.out.println("plan A=RS 50||plan B=Rs 70");
	System.out.println("enter a||b");
	String planopt=sc.next();
	if(planopt.equals("a"))
	amt=50;
	if(planopt.equals("b"))
	amt=70;
		new TestImplementation().implementRecharge(new Airtel(), mob,amt);
		break;
	case "vodafone":
	case "Vodafone":
		System.out.println("plan A=RS 50||plan B=Rs 70");
		System.out.println("enter a||b");
		String planopt1=sc.next();
		if(planopt1.equals("a"))
		amt=50;
		if(planopt1.equals("b"))
		amt=70;
		new TestImplementation().implementRecharge(new Vodafone(), mob,amt);
		break;
		default :System.out.println("wrong input");
	}
	}
	
}
else
{
	System.out.println("Thank you for registering");
}
	//new Checking().addCustomer();
}
	
}
