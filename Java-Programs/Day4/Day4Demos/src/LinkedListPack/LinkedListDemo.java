package LinkedListPack;
import AccountPack.*;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Account> acclist = new LinkedList<Account>();
		Account acc = new Account("RD",60000);
		acclist.add(acc);
		acclist.add(new Account("Savings",2000));
		acclist.add(1,new Account("Current",3000));
		
		acclist.addFirst(new Account("Savings",7000));
		acclist.addLast(new Account("Savings",27000));
		
		Account r=null;
		//iterator
				Iterator<Account> iter = acclist.iterator();
				while(iter.hasNext())
				{
				 r =  iter.next();
				r.dispAcctDetails();
				}
		
				System.out.println("--------------------");
				acclist.remove(1);
				acclist.remove(acc);
				acclist.removeFirst();
				acclist.removeLast();
				
				for(Account r1 : acclist)
					r1.dispAcctDetails();
				
	}

}














