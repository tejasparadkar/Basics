package exception;

import java.util.TreeSet;

public class E3 {	
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		System.out.println("Enter unique integer objects");
		
		try
		{
			t.add(10);
			t.add(20);
			t.add(30);
			t.add(null);
			t.add("Hello");
		}
		catch (NullPointerException e) {
			System.err.println("You have entered null object NOT ALLOWED");
		
		}
		catch (ClassCastException e)
		{
			System.err.println("you have entered different class NOT ALLOWED");
			
		}
		System.out.println("List is: ");
		for(Object obj:t)
		{
			System.out.println(obj);
		}
	}

}
