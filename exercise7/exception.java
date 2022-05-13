/*1. Write a user defined exception class to authenticate
the user name and password.*/



import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);	
	}
}

class Main{
	public static void main(String ar[]){
		String username="aswinak799";
		String password="Password";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username:");
		String u=sc.next();
		System.out.print("Enter Password:");
		String p=sc.next();
		try{
			if((u.equals(username)) && (p.equals(password))){
				System.out.println("Authentication success");
			}
			else{
				throw new myException("Authentication Faild...!");
				}
			}
		catch(myException ex){
					System.out.print(ex.getMessage()+"\n");
			}
	}

}
/*
output
------
case 1
------
Enter Username:aswinak799
Enter Password:Password
Authentication success


case 2
------
Enter Username:aswin
Enter Password:1234
Authentication Faild...!


*/
