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
				System.out.println("Cube of "+i+" is -->"+Math.pow(i, 3));
			
			}		

}

}
/*
OUTPUT
Enter a  number:
5
list of cubes:
Cube of 1 is -->1.0
Cube of 2 is -->8.0
Cube of 3 is -->27.0
Cube of 4 is -->64.0
Cube of 5 is -->125.0

*/
