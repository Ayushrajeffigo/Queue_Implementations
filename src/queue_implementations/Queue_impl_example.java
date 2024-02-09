package queue_implementations;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_impl_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
//		for adding element into queue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
//		to pop as it follows the fifo
		queue.poll();
		System.out.println(queue);
		
		

	}

}
