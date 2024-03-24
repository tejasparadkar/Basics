package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection11 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(30);
		//a.add("Sheela"); ClassCastException
		//a.add(null); NullPointerException
		a.add(250);
		a.add(-10);
		a.add(-50);
		a.add(-890);
		System.out.println("List before sorting: "+a);
		Collections.sort(a);
		System.out.println("List after ASC sorting: "+a);
		Collections.reverse(a);
		System.out.println("List after DESC sorting: "+a);
	}

}
