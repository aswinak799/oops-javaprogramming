/*Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.*/
import Graphics.*;


class p{
	public static void main(String ar[]){
				Rectangle r=new Rectangle();
				r.area(10,5);
				Triangle t=new Triangle();
				t.area(5,10);
				Square s=new Square();
				s.area(10);
				Circle c=new Circle();
				c.area(5);

	}


}


/*
output
------

Area of rectangle having

length=10
breadth=5

Area=50
Area of Triangle having

base=5
height=10
Area=25.0
-----------------
Area of Square having

side=10
Area=100
-----------------
Area of Circle having

radius=5.0
Area=78.5
----------------

