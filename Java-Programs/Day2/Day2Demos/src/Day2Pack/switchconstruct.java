package Day2Pack;
import java.util.*;



public class switchconstruct {
	static int num1,num2,choice;
	static Scanner sc;
	static void acceptUserInput()
	{
		System.out.println("enter 2 integers");
		sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("1:add 2:sub 3:multiply 4:divide");
		System.out.println("enter the choice");
		choice = sc.nextInt();
	}
	static void processUserInput()
	{
		
		switch(choice)
		{
		case 1:
			display(num1+num2);
			
			break;
		case 2:
			display(num1-num2);
			break;
		case 3:
			display(num1*num2);
			break;
		
		default:
			display("invalid choice");
			System.exit(0);
		case 4:
			display(num1/num2);
			break;
		}
	}
	static void display(int res)
	{
		System.out.println("res:"+res);
	}
	static void display(String msg)
	{
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		acceptUserInput();
		processUserInput();
	}

}











