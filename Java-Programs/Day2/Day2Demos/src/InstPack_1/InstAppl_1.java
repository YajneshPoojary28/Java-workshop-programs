package InstPack_1;

import java.util.Scanner;

class Student
{
	//data members
	private String stuName;
	 int stuMarks;
	//methods
	void setStuDetails()
	{
		System.out.println("def");
		stuName=" ";
		stuMarks=0;
	}
	void setStuDetails(String name,int marks)
	{
		System.out.println("par");
		stuName=name;
		stuMarks=marks;
	}
	void setStuDetails(Student s2)
	{
		System.out.println("copy");
		stuName = s2.stuName;
		stuMarks = s2.stuMarks;
	}
	void dispStuDetails()
	{
		System.out.println("stuName:"+stuName);
		System.out.println("stuMarks:"+stuMarks);
		System.out.println("-----------------");
	}
}

public class InstAppl_1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStuDetails();
		s1.dispStuDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name and marks");
		String name = sc.next();
		int marks = sc.nextInt();
		Student s2 = new Student();
		s2.setStuDetails(name,marks);
		s2.dispStuDetails();
		
		Student s3 = new Student();
		
		s3.setStuDetails(s2);
		s3.dispStuDetails();
		s2.stuMarks = s2.stuMarks + 2;//90
		s2.dispStuDetails();
		s3.dispStuDetails();
	}

}
