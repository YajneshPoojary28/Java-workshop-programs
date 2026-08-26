package Day3Pack;

abstract class Student//super
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
	 
	
	//abstract void display();
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
		System.out.println("stuName:"+stuName);
		//super.display();//Student display
		System.out.println("shuttleCost:"+shuttleCost);
	}
	
}

public class InheritanceDemo {
	public static void main(String[] args) {
		/*
		Student rs = new RStudent("Shobha",3000);
		rs.display();
		System.out.println("--------------------");
		
		Student nrs = new NRStudent("Shobha",1000);
		nrs.display();
		*/
		
		Student s = new RStudent("Shobha",3000);
		s.display();
	}

}












