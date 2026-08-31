package ThreadPack_2;

class UserThread implements Runnable
{
    Thread cth;
    
    
    UserThread(String name)
    {
    
    	cth = new Thread(this,name);
    	cth.start();
    }
	
	public void run() {
	
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(cth.getName()+"-----"+i);
				Thread.sleep(1000);//InterruptedException - checked
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}


public class ThreadDemo {
	public static void main(String[] args) {
    
	UserThread  u = new UserThread("ChildThread");
	
	Thread mt = Thread.currentThread();
	System.out.println("Name:"+mt.getName());
	System.out.println("Priority:"+mt.getPriority());
	mt.setName("MainThread");
	mt.setPriority(8);
	System.out.println("Name:"+mt.getName());
	System.out.println("Priority:"+mt.getPriority());
	try
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(mt.getName()+"-----"+i);
			Thread.sleep(1000);//InterruptedException - checked
		}
		u.cth.join();//Main thread waits till child thread completes
	}
	catch(InterruptedException e)
	{
		System.out.println(e.getMessage());
	}
  }


}
