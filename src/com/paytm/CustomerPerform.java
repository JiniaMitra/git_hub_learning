package com.paytm;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class CustomerPerform {
	ArrayList<Customer> als=new ArrayList<Customer>();
	ArrayList<Customer> als2=new ArrayList<Customer>();
	File f=new File("C:\\Users\\JI369664\\Desktop\\top gear\\abc1.txt");
	Scanner sc=new Scanner(System.in);
	
	public int adding(long phn)
{
		int flag=0;
		try
		{
			//f.createNewFile();
			
			/*Customer c1=new Customer("jini",200,8274);
			Customer c2=new Customer("ritu",300,9038);
			als.add(c1);
			als.add(c2);
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(als);
			oos.flush();*/
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			als2=(ArrayList<Customer>)ois.readObject();
			//als2.add(new Customer("disha",400,9331));
			
			for(Customer cus:als2)
			{
				if(cus.getPhone_no()==phn){
					System.out.println("already exist"+cus);
					flag=1;
					
					break;}}
				if(flag==0)
				{
					System.out.println("enter name");
			String uname=		sc.next();
					Customer customer=new Customer(uname,0,phn);
					als2.add(customer);
					System.out.println(als2.size());
					
					for(Customer cs:als2)
					{
						System.out.println(cs);
					}
					FileOutputStream fos=new FileOutputStream(f);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(als2);
					oos.flush();
					oos.close();
					
				}
			
			
		}
		catch(Exception e)
		{
			
		}

return flag;
		
		
}
	
	void checkBalance(long mob)
	{
		try
		{
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Customer> als2=(ArrayList<Customer>)ois.readObject();
	System.out.println("deserializing");
	System.out.println(als2.size());
	for(Customer c:als2)
	{
		if(c.getPhone_no()==mob)
		System.out.println(c.getAmount());
	}
		}
		catch(Exception e)
		{
			
		}
	}
	void addAmount(int amount,long mob)
	{
		
		try
		{
			if(amount<100 ||amount>500)
				throw new InvalidAmountException();
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
			newamt=c.getAmount()+amount;
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
}