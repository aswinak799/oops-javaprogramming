/*3. Prepare bill with the given format using
calculate method from interface.*/
import java.util.*;
interface Bill_Gen{
	 void Calculate();


}

class ProductB implements Bill_Gen{
	String name;
	int prod_id;
	int quantity;
	int unit_price;
	int total;
	ProductB(String n,int p,int q,int u){
		this.name= n;
		this.prod_id=p;
		this.quantity=q;
		this.unit_price=u;
	}
	public void Calculate(){
		total=quantity*unit_price;
		System.out.println(prod_id+"\t\t"+name+"\t"+quantity+"\t\t"+unit_price+"\t\t"+total);
	
	}
	

}
class Bill{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("enter Date:");
		String date=sc.next();
		
		System.out.print("enter order No:");
		int oder=sc.nextInt();
		System.out.println("How many products are there:");
		int N=sc.nextInt();
		ProductB [] arr=new ProductB[N];
		for(int i=0;i<N;i++){
			System.out.println("Product "+(i+1));
			System.out.print("Product Name:");
			String name=sc.next();
			
			System.out.print("Product id:");
			int id=sc.nextInt();
			
			System.out.print("Quantity:");
			int q=sc.nextInt();
			
			System.out.print("Unit Price:");
			int price=sc.nextInt();
			
			arr[i]=new ProductB(name,id,q,price);
			
		
		}
		
		System.out.println("order No."+oder);
		
		System.out.println("Date:"+date);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Product_id\tName\tQuantity\tunit_price\ttotal");
		System.out.println("----------------------------------------------------------------");
		int t=0;
		for(int j=0;j<N;j++){
			arr[j].Calculate();
			t=t+arr[j].total;
		
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Net Amount "+t);
	
	}

}




/*
OUTPUT
-------
enter Date:10/02/2022
enter order No:1
How many products are there:
2

Product 1

Product Name:PEN
Product id:101
Quantity:5
Unit Price:15

Product 2

Product Name:BOOK
Product id:102
Quantity:4
Unit Price:35


						
order No.1
Date:10/02/2022
----------------------------------------------------------------
Product_id	Name	Quantity	unit_price	total
----------------------------------------------------------------
101		PEN	5		15		75
102		BOOK	4		35		140
----------------------------------------------------------------
Net Amount 215

*/
