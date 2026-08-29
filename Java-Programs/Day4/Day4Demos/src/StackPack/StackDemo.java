package StackPack;

import java.util.Stack;
import AccountPack.Account;

class SavingsAccount extends Account
{
	public SavingsAccount(String type , int bal)
	{	
		super(type,bal);
	}
}

public class StackDemo {
	public static void main(String[] args) {
		Stack<Account> st = new Stack<Account>();
		st.push(new Account("Savings",1000));
		st.push(new Account("Savings",2000));
		st.push(new Account("Current",3000));
		
		st.push(new SavingsAccount("Savings",1000));
		
		System.out.println(st.size());//3
		
		//traverse with a loop
		for(int i=0;i<st.size();i++)
		{
			Account r = st.get(i);
			//r.dispAcctDetails();
			System.out.println(r);
		}
		
		System.out.println(st.size());
		System.out.println("------------------");
		//pop
		
		while(st.size()>0)
		{
			Account r = st.pop();//LIFO
			System.out.println(r);
		}
		System.out.println(st.size());
	}

}












