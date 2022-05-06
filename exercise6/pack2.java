/*
5. Create an Arithmetic package that has classes and interfaces
for the 4 basic arithmetic operations. Test the package by
implementing all operations on two given numbers
*/

import Arithematic.*;
import java.util.*;

class pack2{
	public static void main(String ar[]){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 2 Numbers ");
				int a=sc.nextInt();
				int b=sc.nextInt();

				Add add=new Add();
				add.Result(a,b);

				Sub sub=new Sub();
				sub.Result(a,b);

				Mul mul=new Mul();
				mul.Result(a,b);

				Div div=new Div();
				div.Result(a,b);

	}


}

/*
output
------
Enter 2 Numbers 
18  
6
Addition Result
Result=24
----------------
Substraction Result
Result=12
----------------
Multiplication Result
Result=108
----------------
Division Result
Result=3.0
----------------


*/



















