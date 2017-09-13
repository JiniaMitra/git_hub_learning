package com.paytm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Airtel implements PayTM {
File f =new File("C:\\Users\\JI369664\\Desktop\\top gear\\abc1.txt");
public void recharge(long mob, int amount) {
		
		try
		{
			//if(amount<100 ||amount>500)
				//throw new InvalidAmountException();
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Customer> als2=(ArrayList<Customer>)ois.readObject();
	System.out.println("deserializing");
	System.out.println(als2.size());
	int i=0,j=0;
	int newamt=0;
	String name1=null;
	for(Customer c:als2)
	{
		
		if(c.getPhone_no()==mob)
		{
			if(c.getAmount()<amount)
				throw new NotEnoughBalanceException();
			newamt=c.getAmount()-amount;
			name1=c.getUname();
			j=als2.indexOf(c);
		//als2.remove(c);
		
		}
	
		
	}
	Customer cnew=new Customer(name1, newamt, mob);
	als2.remove(j);
	als2.add(j, cnew);
	for(Customer c:als2)
		System.out.println(c);
	
	FileOutputStream fos=new FileOutputStream(f);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(als2);
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
	}
	
	//System.out.println("welcome to airtel service");


	public void denomination() {
		// TODO Auto-generated method stub
	}
	
}
