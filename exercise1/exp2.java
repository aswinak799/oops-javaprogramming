/*Write a program in Java to display the cube of the number up to a given
integer.*/
import java.util.Scanner;
class Cube{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a  number:");

		int n= s.nextInt();
		System.out.println("list of cubes:");

		for(int i=1;i<=n;i++){
				System.out.println(Math.pow(i, 3));
			
			}		

}

}
/*
OUTPUT
Enter a  number:
5
list of cubes:
1.0
8.0
27.0
64.0
125.0
*/
