package Graphics;

interface AreaS{

	void area(int a);
	
}


public class Square implements AreaS{

	public void area(int a){
		System.out.println("Area of Square having\n\nside="+a);
		System.out.println("Area="+(a*a)+"\n-----------------");

		
	}

}
