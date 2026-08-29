package AccountPack;

public class Account {
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












