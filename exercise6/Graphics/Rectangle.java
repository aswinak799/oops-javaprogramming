/*Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.*/
package Graphics;

interface Area{

	void area(int l,int b);
	
}


public class Rectangle implements Area
{

	public void area(int l,int b){
		System.out.println("Area of rectangle having\n\nlength="+l+"\nbreadth="+b);
		System.out.println("\nArea="+(l*b)+"\n-----------------");

		
	}

}





