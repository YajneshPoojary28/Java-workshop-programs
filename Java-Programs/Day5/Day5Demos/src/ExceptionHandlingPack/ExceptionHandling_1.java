package ExceptionHandlingPack;

class MathOp
{
	int num;
	MathOp(int m)
	{
		num=m;
	}
	void disp()
	{
		System.out.println(num);
	}
	void divide(int d)
	{
		num=num/d;
		/*
		try
		{
			if(d==0)
				throw new ArithmeticException("/ by zero");
			else
				num=num/d;
		}
		
		
		catch(NullPointerException a)
		{
			System.out.println("catch block - AE");
			System.out.println(a.getMessage());
		}
		finally
		{
		System.out.println("in divide");
		}*/
		
	}
}
public class ExceptionHandling_1 {
	public static void main(String[] args) {
		MathOp m =new MathOp(12);
		m.divide(0);
		/*
		try
		{
		m.divide(0);
		}
		catch(Exception a)
		{
			System.out.println("catch block - E");
			
			System.out.println(a.getMessage());
		}
		System.out.println("in main");*/
	}

}











