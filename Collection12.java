package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection12 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Tejas");
		a.add("Rajesh");
		a.add("Suhas");
		a.add("Vasant");
		a.add("Vandana");
		a.add("Vilas");
		System.out.println("***** Insertion Order *****");
		System.out.println(a);
		System.out.println("***** Ascending Order *****");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("***** Descending Order *****");
		Collections.reverse(a);
		System.out.println(a);
		Collections.reverse(a);
		Iterator i = a.iterator();
		System.out.println("***** Iterator in Forward *****");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ListIterator j = a.listIterator(a.size());
		System.out.println("***** ListIterator in backward *****");
		while(j.hasPrevious())
		{
			System.out.println(j.previous());
		}

	}

}
