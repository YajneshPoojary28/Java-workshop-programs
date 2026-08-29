package EmpPack;
public class Emp 
{
	int empID;
	String empName;
	double empSal;
	String empDesig;
	
	
	public Emp(int empID, String empName, double empSal, String empDesig) {
		
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesig = empDesig;
	}


	public void dispEmpDetails()
	{
		System.out.println("empID:"+empID);
		System.out.println("empName:"+empName);
		System.out.println("empSal:"+empSal);
		System.out.println("empDesig:"+empDesig);
	}
	static public void searchEmpRecord(String desig,Emp []e)
	{ 
		boolean status=false;
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!=null)
			{
				if(e[i].empDesig.equals(desig))
				{
					status=true;
					e[i].dispEmpDetails();
				}
			}
		}
		if(status==false)
			System.out.println("no emp records matched by the given designation");
		
	}
	static public void searchEmpRecord(int id,Emp [] e)
	{
		boolean status=false;
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!=null)
			{
				if(e[i].empID==id)
				{
					status=true;
					e[i].dispEmpDetails();
				}
			}
		}
		if(status==false)
			System.out.println("no emp records matched by the given id");
		
	}
	
	
}












