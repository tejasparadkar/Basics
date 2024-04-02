package map;

import java.util.LinkedHashMap;

public class M2 {

	public static void main(String[] args) {
		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "Sheela");
		l.put(2, "Shakila");
		l.put(3, "Sheela");
		l.put(4, "Laila");
		l.put('C',"ABC");
		l.put(false,"DEF");
		l.put(7, null);
		System.out.println("All objects: "+l);
		System.out.println("Contains Sheela " +(l.containsValue("Sheela")));
		System.out.println("Contains null "+(l.containsValue(null)));	
		if(l.containsValue(null))
		{
			System.out.println("It is present");
		}
		else
		{
			System.out.println("Null does not exist");
		}
		l.remove(7);
		System.out.println("Removing last object: "+l);
		l.clear();
		System.out.println("Removing all objects: "+l);
	}
}
