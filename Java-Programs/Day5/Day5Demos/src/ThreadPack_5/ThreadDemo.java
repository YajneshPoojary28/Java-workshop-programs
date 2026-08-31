package ThreadPack_5;

class Target
{
	 void display(String name)
	{
		try
		{
			System.out.print("["+name);
			Thread.sleep(1000);
			System.out.println("]");
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

class UserThread implements Runnable
{
	Thread cth;
	Target tar;
	UserThread(String name,Target t)
	{
		cth = new Thread(this,name);
		tar = t;
		cth.start();
	}
	public void run()
	{
		synchronized (tar) {
			tar.display(cth.getName());
		}
		
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Target t = new Target();
		UserThread u1 = new UserThread("Java",t);
		UserThread u2 = new UserThread("C++",t);
		UserThread u3 = new UserThread("C#",t);
		
		Thread mth = Thread.currentThread();
		try
		{
		u1.cth.join();
		u2.cth.join();
		u3.cth.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}

}











