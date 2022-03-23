/*Write a Java program to find the number of days in a month for a given year.
Check Leap year also.*/
import java.util.*;

public class exp3 {
	public static void main(String args[]) {
		int days=0;
		String month_name="unkown";
		Scanner obj1= new Scanner(System.in);
		System.out.print("Enter month:");
		int month= obj1.nextInt();
		System.out.print("Enter year:");
		int year=obj1.nextInt();
		switch(month) 
		{
		case 1:
			month_name="Januvary";
			days=31;
			break;
		case 2:
			month_name="Februvary";
			if((year%400==0) || ((year%4==0)&& (year%100!=0)))
				days=29;
			else
				days=28;
			break;
		case 3:
			month_name="March";
			days=31;
			break;
		case 4:
			month_name="April";
			days=30;
			break;
		case 5:
			month_name="May";
			days=31;
			break;
		case 6:
			month_name="June";
			days=30;
			break;
		case 7:
			month_name="July";
			days=31;
			break;
		case 8:
			month_name="Augest";
			days=31;
			break;
		case 9:
			month_name="September";
			days=30;
			break;
		case 10:
			month_name="October";
			days=31;
			break;
		case 11:
			month_name="November";
			days=30;
			break;
		case 12:
			month_name="December";
			days=31;
			break;
		
		}
		System.out.println(month_name+" "+year+"\n"+days+" days in the month");
		if(year%400==0)
		{
			System.out.print("It is a leapyear");
		}
		else if(year%4==0 && year%100!=0){
			System.out.print("It is a leapyear");
		}
		else {
			System.out.print("It is not a leapyear");
		}
		
		
		
		
	}

}
/*
OUTPUT
case 1
Enter month:4
Enter year:2001
April 2001
30 days in the month
It is not a leapyear

case 2
Enter month:2
Enter year:2000
Februvary 2000
29 days in the month
It is a leapyear

*/
