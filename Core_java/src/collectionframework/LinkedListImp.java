package collectionframework;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListImp {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.addFirst("D");
		list.add("E");
		System.out.println(list);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(100);
		pq.offer(90);
		pq.offer(30);
		pq.offer(60);
		pq.offer(10);
		
		System.out.println(pq);
	}
}
