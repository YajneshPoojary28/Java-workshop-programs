package Day2Pack;

public class Constructs {
	static void invoke()
	{
	
				for(int i=1;i<10;i++)
				{
					if(i==5)
					//	break;
					//continue;
					//System.exit(0);
					return;
					else
						System.out.println(i);
				}
				System.out.println("outside loop");
	}
	public static void main(String[] args) {
		invoke();
		System.out.println("in main");
		return;
		//System.out.println("after return");
	}

}
