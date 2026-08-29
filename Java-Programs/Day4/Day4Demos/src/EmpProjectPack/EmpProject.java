package EmpProjectPack;
import EmpPack.Emp;
import IDGeneratorPack.*;
import java.util.Scanner;

public class EmpProject {
	public static void main(String[] args) {
		Emp []e  = new Emp[3];
		int empCount=0;
		Scanner sc = new Scanner(System.in);
		int choice;
		String str;
		do
		{
			System.out.println("1:AddEmp 2:DispEmp 3:SearchByDesig 4:SearchByID");
			System.out.println("enter the choice");
			choice= sc.nextInt();
			switch(choice)
			{
			case 1: 
				if(empCount<e.length)
				{
					System.out.println("enter the name , sal , desig");
					String name = sc.next();
					double sal = sc.nextDouble();
					String desig = sc.next(); 
					e[empCount] = new Emp(IDGenerator.getID(),name , sal, desig);
					empCount++;
				}
				else
					System.out.println("no more employees can be added");
				break;
				
			case 2:
				if(empCount==0)
					System.out.println("Emp records are not yet available");
				else
					for(int i=0;i<empCount;i++)
					   e[i].dispEmpDetails();
				break;
				
			case 3:
				if(empCount==0)
					System.out.println("Emp records are not yet available");
				else
				{
					System.out.println("enter the designation");
					String desig = sc.next();
					Emp.searchEmpRecord(desig, e);
				}
				break;
			case 4:
				if(empCount==0)
					System.out.println("Emp records are not yet available");
				else
				{
					System.out.println("enter the id");
					int id = sc.nextInt();
					Emp.searchEmpRecord(id, e);
				}
				break;
				
			default:
				System.out.println("invalid choice");
				break;
				
			}
			System.out.println("enter yes to continue");
			str = sc.next();
		}while(str.equalsIgnoreCase("yes"));
		
	}

}


