package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class M1 {

	public static void main(String[] args) {
		
		//random order
		HashMap h = new HashMap();
		h.put(1, "Sheela");
		h.put(2, "Shakila");
		h.put(3, "Sheela");
		h.put(4, "Laila");
		h.put("Sheela",5);
		h.put(null, true);
		h.put('c', null);
		h.put(false, -5.5);
		//h.put(1, "urfi");old value will be replaced by new value when key is same
		System.out.println("HashMap: "+h);
		
		//insertion order
		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "Sheela");
		l.put(2, "Shakila");
		l.put(3, "Sheela");
		l.put(4, "Laila");
		l.put("Sheela",5);
		l.put(null, true);
		l.put('c', null);
		l.put(false, -5.5);
		System.out.println("LinkedHashMap: "+l);
		
		//ascending order
		TreeMap t = new TreeMap();
		t.put(1, "Sheela");
		t.put(2, "Shakila");
		t.put(3, "Sheela");
		t.put(4, "Laila");
		//l.put(null, true);	NullPointerException
		//l.put('c', null);		ClassCastException
		System.out.println("TreeMap: "+t);
	}

}
