package collectionframework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeImplementation {
	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<>();
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.remove());
		System.out.println(dq);
		
		System.out.println(dq.offer(2));
	}
}
