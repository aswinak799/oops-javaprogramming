/*2. Find the average of N positive integers, raising a user
defined exception for each negative input.*/
import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}

}

class Main{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n=sc.nextInt();
		
		
		int d;
		int total=0;
		int c=0;
		System.out.println("Enter numbers");		
		for(int i=n;i>0;i--){
			d = sc.nextInt();
			try{
				if(d>=0){
					c++;
					total=total+d;
				}
				else{
					throw new myException("negative numbers not allowed\nplease enter positive number");
					
				}
			
			}
			catch(myException ex){
				System.out.println(ex.getMessage()+"\n");
			
			}
			if(d<0){
			
				i=i+1;
		}
		}
		System.out.println("Average of "+c+" positive numbers="+(double)total/c);
	
	
	}


} 
/*
output
------
Enter the number of items:
5
Enter numbers
10
-5
negative numbers not allowed
please enter positive number

10
20
5
5
Average of 5 positive numbers=10.0

*/
