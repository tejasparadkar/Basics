package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collection16 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hi");
		hs.add(10);
		hs.add("Hi");
		hs.add(10);
		hs.add(null);
		hs.add('c');
		System.out.println("HashSet: "+hs);
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("bye");
		ls.add(null);
		ls.add(2.4);
		ls.add(4);
		ls.add("bye");
		ls.add(null);
		System.out.println("LinkedHashSet: "+ls);
		TreeSet ts = new TreeSet();
		ts.add("poha");
		ts.add("noodles");
		ts.add("vadapav");
		ts.add("cake");
		//ts.add(false); ClassCastException
		//ts.add(null); NullPointerException
		System.out.println("TreeSet: "+ts);
	}

}
