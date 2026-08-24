package Day1Pack;
//loop -> initialization , condition , iteration
public class loops {
	public static void main(String[] args) {
		//for
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//while 
		int j=1;
		/*
		 * while(j<=10) {
		 * 
		 * System.out.print(j+" "); 
		 * j++; 
		 * }
		 */
		while(j<=10)
		{
				
				System.out.println(j++);
				
		}
		System.out.println();
		
		//do-while
		/*
		 * int m=11; do {
		 * 
		 * System.out.print(m+" "); m++; }while(m<=10); System.out.println();
		 */
		
		int m=1;
		do
		//{
			
			System.out.println(m++);
			
		//}
		while(m<=10);
		System.out.println();
	}

}

