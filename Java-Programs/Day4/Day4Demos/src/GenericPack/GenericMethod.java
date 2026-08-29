package GenericPack;

import java.util.Scanner;

class Emp 
{
	String empName;
	Emp(String name)
	{
		empName=name;
	}
	void disp()
	{
		System.out.println(empName);
	}
	public String toString()
	{
		return empName;
	}
	
}
public class GenericMethod {
	static <T>void display(T [] a)
	{
		for(T data : a)
			System.out.println(data);
	}
	public static void main(String[] args) {
		
		Emp r = new Emp("Shobha");
		System.out.println(r.toString());
		//r.disp();
		
		
		
		
		Integer [] a = {11,12,13};//float  Float int Integer
		display(a);
		System.out.println("--------------");
		Double [] d = {11.1,12.1,13.1};
		display(d);
		System.out.println("--------------");
		Emp [] ar = new Emp[3];
		for(int i=0;i<ar.length;i++)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the name");
			
			ar[i]=new Emp(s.next());
		}
		
		display(ar);
	}

}
