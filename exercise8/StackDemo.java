/*3. Program to remove an object from the Stack when the position is passed
as parameter*/
import java .util.*;

class StackDemo{
	public static void main(String args[]){
		Stack<Integer>stack =new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		
		System.out.println("size of the Stack:"+stack.size());
		
		System.out.println("Contents in the Stack:"+stack);
		stack.removeElementAt(2);
		System.out.println("Contents in the Stack after remove at index 2:"+stack);

		
	}


}
/*

OUTPUT
-------
size of the Stack:4
Contents in the Stack:[10, 20, 30, 40, 50]
Contents in the Stack after remove at index 2:[10, 20, 40, 50]
*/
