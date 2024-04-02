package map;

import java.util.*;

public class Conversion {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(11.5);
		a.add(10);
		a.add(11.5);
		a.add(null);
		a.add('c');
		System.out.println("List: "+a);
		System.out.println("convert list to set");
		HashSet h = new HashSet(a);
		System.out.println("Set: "+h);
		System.out.println("converting set into list");
		ArrayList l = new ArrayList(h);
		System.out.println("List: "+l);
		LinkedHashMap l1 = new LinkedHashMap();
		l1.put(1, "Sheela");
		l1.put(2, "Shakila");
		l1.put(3, "Sheela");
		l1.put(4, "Laila");
		l1.put("Sheela",5);
		l1.put(null, true);
		l1.put('c', null);
		l1.put(false, -5.5);
		System.out.println("LinkedHashMap: "+l1);
		System.out.println("converting map to set");
		Set s = l1.entrySet();
		System.out.println("Set: "+s);
		System.out.println("Converting map into list");
		//convert map to set
		Set s1 = l1.entrySet();
		//convert set to list
		ArrayList l2 = new ArrayList(s1);
		System.out.println("List: "+l2);
		
		System.out.println("Collection to array");
		System.out.println("Collection: "+a);
		System.out.println("Array: ");
		Object[] i=a.toArray();
		for(Object i1: i)
		{
			System.out.println(i1);
		}
	}

}
