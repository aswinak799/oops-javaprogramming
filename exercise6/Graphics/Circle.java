package Graphics;

interface AreaC{

	void area(double r);
	
}




public class Circle implements AreaC{

	public void area(double r){
		System.out.println("Area of Circle having\n\nradius="+r);
		System.out.println("Area="+(3.14*r*r)+"\n----------------");
		
	}

}


