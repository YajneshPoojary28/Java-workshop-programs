package Day1Pack;
import java.util.*;

//import java.lang.*;//implicitly imported in every java program

public class switchconstruct {
	public static void main(String[] args) {
		int num1,num2,choice;
		Scanner sc;
		String n1;
		String str;
		
		do
		{
			System.out.println("enter 2 integers");//"11" "12"  "11"+"12" 1112
			sc = new Scanner(System.in);
			//wrapper classes  Integer Float Double Char
			n1 = sc.next();
			num1 = Integer.parseInt(n1);
			num2 = sc.nextInt();
			
			
			System.out.println("1:add 2:sub 3:multiply 4:divide");
			System.out.println("enter the choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("add:"+ (num1+num2));
				break;
			case 2:
				System.out.println("sub:"+ (num1-num2));
				break;
			case 3:
				System.out.println("multiply:"+ (num1*num2));
				break;
			
			default:
				System.out.println("invalid choice");
				//break;
				System.exit(0);
			case 4:
				System.out.println("divide:"+ (num1/num2));
				break;
			}
			System.out.println("enter yes to continue");//YES
			str = sc.next();
		}while(str.equalsIgnoreCase("yes"));
		System.out.println("outside switch block");
		
	}

}











