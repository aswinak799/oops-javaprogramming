/*4. Program to demonstrate the creation of queue object using the
PriorityQueue class*/
import java.util.*;

class pque {
	public static void main(String args[]){
		PriorityQueue<String>pq =new PriorityQueue<String>();
		pq.add("anand");
		pq.add("alen");
		pq.add("jithu");
		pq.add("midhun");
		pq.add("junaid");
		pq.add("sanan");
		System.out.println("contents in pq"+pq);

		Iterator<String> itr=pq.iterator();


		System.out.println("\nusing itrator print elements in queue \n");
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}		
		System.out.println();
	}

}



/*
output
-----
contents in pq[alen, anand, jithu, midhun, junaid, sanan]

using itrator print elements in queue 

alen	anand	jithu	midhun	junaid	sanan	
*/


