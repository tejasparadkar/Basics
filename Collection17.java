package Collections;
import java.util.Stack;

public class Collection17 {
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		s.add(10);
		s.push(40);
		s.push(true);
		s.push(71);
		System.out.println(s.push("hi"));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.search(40));
	}
}