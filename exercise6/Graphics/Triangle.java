package Graphics;

interface AreaT{

	void area(int b, int h);
	
}


public class Triangle implements AreaT{

	public void area(int b,int h){
		System.out.println("Area of Triangle having\n\nbase="+b+"\nheight="+h);
		System.out.println("Area="+(0.5*b*h)+"\n-----------------");
		
		
	}

}


