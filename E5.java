package exception;
//try-multiple catch block
import java.util.*;

public class E5 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("Hi");
		a.add('c');
		System.out.println("List: "+a);
		try {
			System.out.println(a.get(-1));
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Specify valid index");
		}
		catch (RuntimeException e) {
			System.out.println("exception handled");
		}
		catch (Throwable e) {
			System.out.println("Something went wrong");
		}
	}

}
