//suspend-resume
//Mainthread to be suspended till child reaches the condition i==5
//Mainthread resumes when condition i==5 is met
package ThreadPack_4;

class UserThread extends Thread
{
    Thread mt1;
    UserThread(String name,Thread mt)
    {
    	    mt1=mt;
    	    setName(name);
    		start();
    }
	
	public void run() {
	
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==5)
				{
					
					synchronized (mt1) {
						//mt1.notify();
						mt1.resume();
					}
				}
					
				System.out.println(getName()+"-----"+i);
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
    
	
	
	Thread mt = Thread.currentThread();
	UserThread  u = new UserThread("ChildThread",mt);
	
	System.out.println("Name:"+mt.getName());
	System.out.println("Priority:"+mt.getPriority());
	mt.setName("MainThread");
	mt.setPriority(8);
	System.out.println("Name:"+mt.getName());
	System.out.println("Priority:"+mt.getPriority());
	try
	{
		
		synchronized (mt) {
			//mt.wait();
			mt.suspend();
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(mt.getName()+"-----"+i);
			Thread.sleep(1000);//InterruptedException - checked
		}
		
	}
	catch(InterruptedException e)
	{
		System.out.println(e.getMessage());
	}
  }


}
