package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collection19 {

	public static void main(String[] args) {
		Queue a = new PriorityQueue();
		a.offer(20);
		a.offer(10);
		//a.offer("hi");ClassCastException
		a.offer(20);
		//a.offer(null);NullPointerException
		a.offer(78);
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
	}

}