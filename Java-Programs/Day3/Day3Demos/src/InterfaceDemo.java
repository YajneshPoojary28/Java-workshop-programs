
/*
interface IVehicle
{
	void setSpeed(int s);//public abstract void setSpeed(int s);
	int getSpeed();
}

class Vehicle implements IVehicle
{
	int speed;
	public void setSpeed(int s)
	{
		speed=s;
	}
	public int getSpeed()
	{
		return speed;
	}
}
*/

interface IVehicle_1
{
	void setSpeed(int s);
}
interface IVehicle_2 extends IVehicle_1
{
	int getSpeed();
}
class CC
{

}
class DD
{
	
}
//class Vehicle extends CC implements IVehicle_1,IVehicle_2
class Vehicle implements IVehicle_2
{
	int speed;
	public void setSpeed(int s)
	{
		speed=s;
	}
	public int getSpeed()
	{
		return speed;
	}
}



public class InterfaceDemo {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setSpeed(80);
		System.out.println("Speed:"+v.getSpeed());
	}

}











