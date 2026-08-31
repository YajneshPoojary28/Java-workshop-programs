package ExceptionHandlingPack;

class SpeedViolationException extends Exception
{
	String msg;
	SpeedViolationException(String m)
	{
		msg=m;
	}
	public String toString()
	{
		return msg;
	}
}
class Vehicle
{
	int speed;
	void setSpeed(int s)throws SpeedViolationException
	{
		if(s>80)
			throw new SpeedViolationException("speed exceeded threshhold speed of 80kmph");
		else
			speed = s;
	}
}

public class UserDefinedException {
	public static void main(String[] args) //throws SpeedViolationException
	{
		Vehicle v = new Vehicle();
		try
		{
		v.setSpeed(90);
		}
		catch(SpeedViolationException s)
		{
			System.out.println(s);
		}
		System.out.println("in main");
	}

}







