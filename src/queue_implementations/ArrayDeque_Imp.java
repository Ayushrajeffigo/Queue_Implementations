package queue_implementations;

import java.util.ArrayDeque;



public class ArrayDeque_Imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		deq.offer(10);
		deq.offer(20);
		deq.offer(30);
		System.out.println(deq);
		deq.offerFirst(2);
		System.out.println(deq);
		deq.offerLast(100);
		System.out.println(deq);
//		functions with their use
		deq.peekFirst();
		deq.peekLast();
		deq.pollFirst();
		deq.pollLast();
	}

}
