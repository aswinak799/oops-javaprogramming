/*Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects.*/


import java.util.*;

interface AP{
	void input();
	void area();
	void perimeter();
}
class Circle implements AP{
	Scanner sc=new Scanner(System.in);
	int r=0;
	double pi=3.14;
	double area=0;
	double perimeter=0;
	public void input(){
		System.out.println("Enter Radius");
		this.r=sc.nextInt();	
	
	}
	
	public void area(){
		area=pi*r*r;
		System.out.println("Area="+area);
	
	}
	
	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("perimeter="+perimeter);
	
	}


}



class Rectangle implements AP{
	Scanner sc=new Scanner(System.in);
	int l=0;
	int b=0;
	double area=0;
	double perimeter=0;
	public void input(){
		System.out.println("Enter length and breadth");
		this.l=sc.nextInt();
		this.b=sc.nextInt();
	
	}
	
	public void area(){
		area=l*b;
		System.out.println("Area="+area);
	
	}
	
	public void perimeter(){
		perimeter=2*(l+b);
		System.out.println("perimeter="+perimeter);
	
	}


}




class AreaPeri{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		Rectangle r= new Rectangle();
	
		while(true){
			
			System.out.println("1.Circle\n2.Rectangle\n3.Exit..");
			System.out.print("Enter your choice:");			
			int opt =sc.nextInt();
			switch(opt){
				case 1:System.out.println("\n\nCircle");
					   c.input();
					   c.area();
					   c.perimeter();
					   System.out.println(".........................");
					   break;
				case 2:System.out.println("\n\nRectangle");
					   r.input();
					   r.area();
					   r.perimeter();
					   System.out.println(".........................");
					   
					   break;
			   default:System.out.println("Exiting...!");
			   
			   		   System.exit(0);
			   		   break;
			}
		
		
		}
	
	} 


}


/*
output
------
1.Circle
2.Rectangle
3.Exit..
Enter your choice:1


Circle
Enter Radius
10 
Area=314.0
perimeter=62.800000000000004
.........................
1.Circle
2.Rectangle
3.Exit..
Enter your choice:2


Rectangle
Enter length and breadth
5 8
Area=40.0
perimeter=26.0
.........................
1.Circle
2.Rectangle
3.Exit..
Enter your choice:5
Exiting...!
*/
