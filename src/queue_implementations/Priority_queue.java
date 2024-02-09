package queue_implementations;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//follow the concepts of minheap
// implemented by queue itself so all that property comes into this
public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> priority = new PriorityQueue<Integer>(Comparator.reverseOrder());
		priority.offer(10);
		priority.offer(0);
		priority.offer(20);
		priority.offer(30);
		System.out.println(priority);
		System.out.println(priority.peek()); //for getting out the most favourable one
		priority.poll(); //to pop
		System.out.println(priority.poll());

	}

}
