//constructors,static
package InstPack_3;

import java.util.Scanner;

class RegNoGenerator
{
	static int regNo;
	static
	{
		regNo=0;
	}
	static int getRegNo()
	{
		return ++regNo;
	}
}

class Student
{
	//data members
	private String stuName;
	 int stuMarks;
	 int stuRegNo;
	 static String courseName;
	//methods
	 static
	 {
		 System.out.println("static block");
		 courseName="Java";
	 }
	
	Student(String name,int marks,int regNo)
	{
		System.out.println("par");
		stuName=name;
		stuMarks=marks;
		stuRegNo = regNo;
	}
	
	void dispStuDetails()
	{
		System.out.println("courseName:"+courseName);
		System.out.println("stuRegNo:"+stuRegNo);
		System.out.println("stuName:"+stuName);
		System.out.println("stuMarks:"+stuMarks);
		System.out.println("-----------------");
	}
	
	
}

public class InstAppl_3 {
	public static void main(String[] args) {
		
		Student [] arrStu = new Student[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arrStu.length;i++)
		{
		System.out.println("enter name and marks");
		String name = sc.next();
		int marks = sc.nextInt();
		arrStu[i] = new Student(name,marks,RegNoGenerator.getRegNo());
		
		}
		
		for(int i=0;i<arrStu.length;i++)
			arrStu[i].dispStuDetails();
		
		
	}

}
