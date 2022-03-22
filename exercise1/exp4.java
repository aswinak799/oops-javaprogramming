/*Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/
import java.util.*;

public class exp4{
	public static void main(String args []){
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int x= obj2.nextInt();
		int y= obj2.nextInt();
		int z= obj2.nextInt();
		if(x<y && y<z)
		{
			System.out.println("Incresing order....!");
		}
		else if(x>y && y>z)
		{
			System.out.println("Dicresing order....!");
		}
		else {
			System.out.println("Neither Incresing Nor Dicresing order....!");
		}
		
		
		
	}

}
/*
OUTPUT
Enter 3 numbers:
10
20
50
Incresing order....!


*/
