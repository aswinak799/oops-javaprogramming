/*1. Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations*/



import java.util.*;


class ArrayListEx{
	public static void main(String args[]) 	{

		// Create an array list.
		ArrayList<String> Al = new ArrayList<String>();

		System.out.println("Initial size of Al: " + Al.size());

		// Add elements to the array list.
		
		Al.add("car");
		Al.add("bike");
		Al.add("train");
		Al.add("plain");
		Al.add("submarine");
		
		System.out.println("contents of Al: "+Al);
		System.out.println("\nrocket addes 0th index position\n");
		Al.add(0,"rocket");
		System.out.println("contents of Al :"+Al);

		System.out.println("\narray size after addition  " + Al.size());


		
		Al.remove("car");
		System.out.println("\ncontents  after removed car in Al :"+Al); 
		String s=Al.get(3);
		Al.remove(3);
		System.out.println("\ncontents  after removed "+s+" in Al :"+Al); 
	}
	


}

/*outpput
---------
Initial size of Al: 0
contents of Al: [car, bike, train, plain, submarine]

rocket addes 0th index position

contents of Al :[rocket, car, bike, train, plain, submarine]

array size after addition  6

contents  after removed car in Al :[rocket, bike, train, plain, submarine]

contents  after removed plain in Al :[rocket, bike, train, submarine]
*/
