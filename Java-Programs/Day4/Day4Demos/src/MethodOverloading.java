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
}
public class MethodOverloading {
	static void display(Integer [] a)
	{
		/*
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
		
		for(Integer data : a)
			System.out.println(data);
	}
	static void display(Double [] a)
	{
		for(Double data : a)
			System.out.println(data);
	}
	/*static void display(Emp [] a)
	{
				
		for(Emp data : a)
			data.disp();
	}*/
	public static void main(String[] args) {
		
		/*
		Emp [] ar = new Emp[3];
		for(int i=0;i<ar.length;i++)
		{
			Scanner s = new Scanner(System.in);
			ar[i]=new Emp(s.next());
		}
		
		display(ar);*/
		
		
		Integer [] a = {11,12,13};//float  Float int Integer
		display(a);
		System.out.println("--------------");
		Double [] d = {11.1,12.1,13.1};
		display(d);
	}

}







