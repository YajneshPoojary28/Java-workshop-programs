package ArrayListPack;
import java.util.*;


import AccountPack.*;
public class ArrayListDemo {
	//CRUD
	public static void main(String[] args) {
		ArrayList<Account> ar = new ArrayList<Account>();
		ar.add(new Account("Savings",1000));//0
		ar.add(new Account("Current",2000));//2
		ar.add(1,new Account("FixedDeposit",500000));//1
		
		Account acc = new Account("RD",60000);
		ar.add(acc);//3
		Account r = null;
		//expanded for loop
		for(int i=0;i<ar.size();i++)
		{
			r = ar.get(i);
			r.dispAcctDetails();
		}
		System.out.println("--------------------");
		//advanced/range based for loop
		for(Account data : ar)
			System.out.println(data);
		System.out.println("--------------------");
		
		//REMOVE
		ar.remove(acc);
		ar.remove(0);
		ar.removeFirst();
		
		//iterator
		Iterator<Account> iter = ar.iterator();
		while(iter.hasNext())
		{
		 r =  iter.next();
		r.dispAcctDetails();
		}
		
	}
	
	//Ex3
	//Emp []e = new Emp[3];//ArrayList<Emp> e =  new ArrayList<Emp>()

}











