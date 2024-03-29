package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>(new QueueComparator());
		queue.add("Manish");
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("Using element method:" + queue.element());
		System.out.println("Using peek method:" + queue.peek());
		
		Iterator<String> i = queue.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After using remove and poll methods");
		
		System.out.println(queue);
	
		

	}

}
