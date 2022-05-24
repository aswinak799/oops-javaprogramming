/*
2. Program to remove all the elements from a linked list
*/
import java.util.*;
class LinkList {
public static void main(String args[]) {
	LinkedList<String> Ll=new LinkedList<String>();
	//LinkedList<String>Ll = new LinkedList<String>();


		Ll.add("BULB");
		Ll.add("FAN");
		Ll.add("AC");
		Ll.add("PC");
		Ll.add("PHONE");
		Ll.addLast("LIGHT");
		Ll.addFirst("MOUSE");
		System.out.println("size of Ll before deletion: " + Ll.size());
		System.out.println("Contents of Ll before deletion: " + Ll);
		
		Ll.removeFirst();
		Ll.removeLast();	
		System.out.println("Contents of Ll remove first and last element : " + Ll);


		//Ll.removeAll(Ll);
		Ll.clear();
		
		System.out.println("Contents of Ll after deletion: " + Ll);


}
}
/*
size of Ll before deletion: 7
Contents of Ll before deletion: [MOUSE, BULB, FAN, AC, PC, PHONE, LIGHT]
Contents of Ll remove first and last element : [BULB, FAN, AC, PC, PHONE]
Contents of Ll after deletion: []
*/
