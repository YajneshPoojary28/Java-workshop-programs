package InstPack_5;

import java.util.Scanner;

abstract class Student
{
	protected String stuName;
	Student(String name)
	{
		stuName=name;
	}
	
	String getStuName()
	{
		return stuName;
	}
	
}

 class RStudent extends Student
{
	
	int accCost;
	RStudent(String name , int cost)
	{
		super(name);
		accCost = cost;
	}
	
	int getAccCost()
	{
		return accCost;
	}
}

class NRStudent extends Student
{
	int shuttleCost;
	NRStudent(String name , int cost)
	{
		super(name);
		shuttleCost = cost;
	}
	int getShuttleCost()
	{
		return shuttleCost;
	}
	
}
interface IInstitute
{
	void registerStudent();
	void publishStuDetails();
}
class Institute implements IInstitute
{
	Student [] s;
	int stuCount;
	Institute()
	{
		s = new Student[3];
		stuCount=0;
	}
	public void registerStudent()
	{
		int choice=0;
		if(stuCount<s.length)
		{
			System.out.println("1:RStudent 2:NRStudent");
			System.out.println("enter the choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			System.out.println("enter the name");
			String name= sc.next();
			if(choice==1)
				s[stuCount++]=new RStudent(name,3000);
			else if(choice==2)
				s[stuCount++]=new NRStudent(name,1000);
		}
		else
			System.out.println("no more registrations are allowed");
	}
	public void publishStuDetails()
	{
		if(stuCount==0)
			System.out.println("no students registered");
		else
		{
			for(int i=0;i<stuCount;i++)
			{
				//if(s[i].getClass().getName().equals("InstPack_5.RStudent"))
				if(s[i] instanceof RStudent)
				{
					System.out.println(s[i].getStuName());
					System.out.println(((RStudent)s[i]).getAccCost());
				}
				//else if(s[i].getClass().getName().equals("InstPack_5.NRStudent"))
				else if(s[i] instanceof NRStudent)
				{
					System.out.println(s[i].getStuName());
					System.out.println(((NRStudent)s[i]).getShuttleCost());
				}
				System.out.println("------------------------");
			}
				
			
		}
	}
	
}

public class InstAppl_5 {
	public static void main(String[] args) {
		
		
		IInstitute inst = new Institute();
		inst.registerStudent();
		inst.registerStudent();
		inst.registerStudent();
		inst.registerStudent();
		
		inst.publishStuDetails();
	
	}

}












