package TreeSetPack;
import java.util.TreeSet;

class Account implements Comparable
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
	
	public int compareTo(Object o) {
		Account a = (Account)o;
		if(acctBal==a.acctBal)
			return 0;
		else if(acctBal<a.acctBal)
			return 1;
		else
			return -1;
		
	}

}

public class TreeSetDemo_2 {
	public static void main(String[] args) {
		Account a1 = new Account("Savings",1000);
		TreeSet<Account> t = new TreeSet<>();
		t.add(a1);//100
		t.add(new Account("Savings",500));//500
		t.add(new Account("Current",1500));//500
		t.add(new Account("Savings",100));//500
		
		for(Account data : t)
			System.out.println(data);
	}

}

















