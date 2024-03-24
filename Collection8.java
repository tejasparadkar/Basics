package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection8 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(15.5);
		a.add(null);
		a.add('c');
		a.add("Sheela");
		a.add(10);
		a.add(15.5);
		a.add(false);
		a.add(null);
		a.add("Sheela");
		System.out.println("List: "+a);
		System.out.println("****Iterator****");
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
