package EmpPack;


public class PEmp extends Emp
{
	int hra;
	public PEmp(int empID, String empName, double empSal, String empDesig,int hra)
	{
		super(empID,empName,empSal,empDesig);
		this.hra=hra;
	}
	
}
