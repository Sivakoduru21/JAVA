package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_practice {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.offer(40);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());  //print value which is head and remove the value
		System.out.println(pq);

	}

}
