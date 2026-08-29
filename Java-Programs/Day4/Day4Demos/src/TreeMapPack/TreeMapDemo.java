package TreeMapPack;
import java.util.*;


class Account 
{
	String acctType;
	int acctBal;
	
	public Account(String type , int bal)
	{
		acctType = type;
		acctBal=bal;
	}
	public void dispAcctDetails()
	{
		System.out.println("acctType:"+acctType +" acctBal:"+acctBal);
	}
	public String toString()
	{
		return "acctType:"+acctType +" acctBal:"+acctBal;
	}
	
	

}

class Bank
{
	TreeMap<Integer, ArrayList<Account>> tm;
	
	Bank()
	{
		tm = new TreeMap<>();
	}
	void addAccount()
	{
		int ifsc;
		int bal;
		String type;
		Scanner s = new Scanner(System.in);
		System.out.println("enter type , bal , ifsc");//2
		type = s.next();
		bal = s.nextInt();
		ifsc = s.nextInt();
		
		if(tm.containsKey(ifsc))
		{
			ArrayList<Account> ar = tm.get(ifsc);
			ar.add(new Account(type,bal));
		}
		else
		{
			ArrayList<Account> ar = new ArrayList<>();
			ar.add(new Account(type,bal));
			tm.put(ifsc, ar);//1
		}
		
		
	}
	
	void dispAcctDetails()
	{
		Set<Integer> keys = tm.keySet();//1 2
		Iterator<Integer> iter = keys.iterator();
		while(iter.hasNext())
		{
			int ifsc = iter.next();
			System.out.println("IFSC:"+ifsc);
			ArrayList<Account> ar = tm.get(ifsc);
			for(Account acc : ar)
				acc.dispAcctDetails();
		}
	}
}


public class TreeMapDemo {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.addAccount();//1
		b.addAccount();//1
		b.addAccount();//2
		
		b.dispAcctDetails();
	}

}















