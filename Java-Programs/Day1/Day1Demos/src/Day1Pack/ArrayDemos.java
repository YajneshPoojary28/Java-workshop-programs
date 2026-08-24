package Day1Pack;

public class ArrayDemos {
	public static void main(String[] args) {
		//Single dimensional
		/*
		 * int j=11; int [] arr1 = new int[3] ; for(int i=0;i<arr1.length;i++) { arr1[i]
		 * = j++; } for(int i=0;i<arr1.length;i++) System.out.println(arr1[i]);
		 */
		
		//double dimensional array
		//int [][] arr2 = new int[3][3];
		
		int [][] arr2 = {
				{11,12,13},
				{14,15,16},
				{17,18,19}
		};
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
				System.out.print(arr2[r][c]+" ");
			System.out.println();
		}
		/*
		//jagged array
		int [][] arr3 = {
				{11},
				{14,15},
				{17,18,19}
		};
		for(int r=0;r<arr3.length;r++)
		{
			for(int c=0;c<arr3[r].length;c++)
				System.out.print(arr3[r][c]+" ");
			System.out.println();
		}
		
		*/
		
	}

}








