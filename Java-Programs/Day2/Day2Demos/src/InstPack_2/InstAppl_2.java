//constructors,static
package InstPack_2;

import java.util.Scanner;

class Student
{
	//data members
	private String stuName;
	 int stuMarks;
	 static String courseName;
	//methods
	 static
	 {
		 System.out.println("static block");
		 courseName="Java";
	 }
	Student()
	{
		System.out.println("def");
		stuName=" ";
		stuMarks=0;
	}
	Student(String name,int marks)
	{
		System.out.println("par");
		stuName=name;
		stuMarks=marks;
	}
	Student(Student s2)
	{
		System.out.println("copy");
		stuName = s2.stuName;
		stuMarks = s2.stuMarks;
	}
	void dispStuDetails()
	{
		System.out.println("courseName:"+courseName);
		System.out.println("stuName:"+stuName);
		System.out.println("stuMarks:"+stuMarks);
		System.out.println("-----------------");
	}
	
	 static void display(Student r)
	{
		System.out.println(r.stuName +" "+r.stuMarks+" "+courseName);
	}
}

public class InstAppl_2 {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.dispStuDetails();
		//s1.display();
		Student.display(s1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name and marks");
		String name = sc.next();
		int marks = sc.nextInt();
		Student s2 = new Student(name,marks);
		s2.dispStuDetails();
		
		Student s3 = new Student(s2);
		s3.dispStuDetails();
		
	}

}
