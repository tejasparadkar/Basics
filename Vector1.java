package Collections;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		for(int i=1;i<=25;i++)
		{
			v.add(i);
		}
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
	}

}
