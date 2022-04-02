class Product{
	int pcode;
	char pname;
	double price;
	void disp(){
		System.out.println("product code:"+pcode+"\nproduct name:"+pname+"\nproduct price:"+price);
}
}
import java.util*;
class Exp3{
	public static void main(String ar[]){
		Scanner s= new Scanner(Styem.in);

		Product obj1= new Product();
		Product obj2= new Product();
		Product obj3= new Product();
		
		System.out.println("Enter the details of first product");
		System.out.println("Enter  product code:");
		obj1.pcode=s.nextInt();
		System.out.println("Enter  product name:");
		obj1.pcode=s.nextChar();
		System.out.println("Enter  product price:");
		obj1.pcode=s.nextInt();

		System.out.println("Enter the details of second product");
		System.out.println("Enter  product code:");
		obj2.pcode=s.nextInt();
		System.out.println("Enter  product name:");
		obj2.pcode=s.nextChar();
		System.out.println("Enter  product price:");
		obj2.pcode=s.nextInt();

		System.out.println("Enter the details of third product");
		System.out.println("Enter  product code:");
		obj3.pcode=s.nextInt();
		System.out.println("Enter  product name:");
		obj3.pcode=s.nextChar();
		System.out.println("Enter  product price:");
		obj3.pcode=s.nextInt();
		
		

			

}

}

