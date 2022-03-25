import java.util.*;

public class exp1 {

	public static void main(String args []) {			//main function
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the rows columns:");
		System.out.print("rows :");
		int rows=obj.nextInt();
		System.out.print("columns :");
		int cols=obj.nextInt();
		int array1[][]= new int[rows][cols];		// array initialization
		int array2[][]= new int[rows][cols];
		int result[][]= new int[rows][cols];
		
		
		
		System.out.println("enter elements of first matrix:");   // insert elements to array 1
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				array1[i][j]=obj.nextInt();
				
			}
			
		}
		System.out.println("enter elements of second matrix:");	// insert elements to array 2
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				array2[i][j]=obj.nextInt();
				
			}
			
		}
		System.out.println("your added matrix printed below:");	//matrix addition and printing
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				result[i][j]=array1[i][j]+array2[i][j];
				System.out.print("\t"+result[i][j]);
				
			}
			System.out.println();
			
		}
		
			
			
		
		
		
		
	}
}
/*
output

enter the rows columns:
rows :3
columns :3
enter elements of first matrix:
1 2 3
2 5 0
3 0 3
enter elements of second matrix:
5 6 4
1 4 3
8 1 6
your added matrix printed below:
	6	8	7
	3	9	3
	11	1	9


*/
