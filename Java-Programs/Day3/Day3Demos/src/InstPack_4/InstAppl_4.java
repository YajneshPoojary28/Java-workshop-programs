package InstPack_4;

import java.util.Scanner;

abstract class Student
{
	protected String stuName;
	Student(String name)
	{
		stuName=name;
	}
	
	  void display() 
	  { 
		  System.out.println("stuName:"+stuName); 
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
	
	  void display() 
	  { 
		  super.display();
		  System.out.println("accost:"+accCost);
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
	void display()
	{
		
		super.display();//Student display
		System.out.println("shuttleCost:"+shuttleCost);
	}
	
}

class Institute
{
	Student [] s;
	int stuCount;
	Institute()
	{
		s = new Student[3];
		stuCount=0;
	}
	void registerStudent()
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
	void publishStuDetails()
	{
		if(stuCount==0)
			System.out.println("no students registered");
		else
		{
			for(int i=0;i<stuCount;i++)
				s[i].display();
		}
	}
	
}

public class InstAppl_4 {
	public static void main(String[] args) {
		Institute inst = new Institute();
		inst.registerStudent();
		inst.registerStudent();
		inst.registerStudent();
		inst.registerStudent();
		inst.publishStuDetails();
	
	}

}












