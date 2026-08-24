package Day2Pack;

import java.util.Scanner;

class MathOperations
{
	//data members
	int num1 , num2,res;
	public void acceptUserInput()
	{
		System.out.println("enter 2 integers");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
	}
	public void add()
	{
		display(num1+num2);
	}
	public void subtract()
	{
		display(num1-num2);
	}
	public void multiply()
	{
		display(num1*num2);
	}
	public void divide()
	{
		display(num1/num2);
	}
	private void display(int res)//package/default
	{
		System.out.println("res:"+res);
	}
	
}
public class MathOpDemo {
	public static void main(String[] args) {
	
	    String input;
		do
		{
			System.out.println("1:add 2:sub 3:multiply 4:divide");
			System.out.println("enter the choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			MathOperations m = new MathOperations();
			
			m.acceptUserInput();
			switch(choice)
			{
			case 1:
				m.add();
				break;
			case 2:
				m.subtract();
				break;
			case 3:
				m.multiply();
				break;
			
			case 4:
				m.divide();
				break;
			}
			System.out.println("enter yes to continue");
			input = sc.next();
		}while(input.equalsIgnoreCase("yes"));
		
		System.out.println("outside loop");
	}

}










