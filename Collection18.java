package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Collection18 {

	public static void main(String[] args) {
		Queue a = new LinkedList();
		a.offer(20);
		a.offer(10);
		System.out.println(a.offer("hi"));
		a.offer(20);
		a.offer(null);
		a.offer('c');
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a);
	}

}
