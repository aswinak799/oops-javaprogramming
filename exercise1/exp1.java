/*Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000*/
import java.util.Scanner;
class Float{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a floating point number:");
		float f=s.nextFloat();
		if(f>0){
			
				if(f<1){
					System.out.println("Small positive!!!!");				
				}
				else if(f>100000){
						System.out.println("Large positive");						
					}
					else{
						System.out.println("The number is positive");
							}
		}
		else if(0>f){
			
				if(Math.abs(f)<1){
					System.out.println("Small negative!!!!");				
				}
				else if(Math.abs(f)>100000){
						System.out.println("Large negative");						
					}
				else{
						System.out.println("The number is negative number");
							}
		}
		else{
			System.out.println("The number is zero");
		}
		
	}
}
/*
case 1
Enter a floating point number:
.35 
Small positive!!!!

case 2
Enter a floating point number:
1000000 
Large positive

case 3

Enter a floating point number:
-0.5
Small negative!!!!

case 4

Enter a floating point number:
-100546215.555
Large negative
*/

