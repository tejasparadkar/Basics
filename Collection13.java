package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Collection13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList l = new ArrayList();
		for(int i=1;i<=22;i++)
		{
			System.out.println("Enter Hetergeneous Object "+i+" :");
			String a = s.nextLine();
			if (a.isEmpty()) {
			   a = null;
			}
			l.add(a);
		}
		System.out.println("**** FIFO Order****");
		System.out.println(l);
		System.out.println("****get(index) in backward****");
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.println(l.get(i));
		}
		System.out.println("**** For each in forward****");
		for(Object obj:l)
		{
			System.out.println(obj);
		}
		System.out.println("**** Iterator in forward ****");
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("**** ListIterator in forward****");
		ListIterator j = l.listIterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
		System.out.println("**** ListIterator in backward****");
		ListIterator k = l.listIterator(l.size());
		while(k.hasPrevious())
		{
			System.out.println(k.previous());
		}
		System.out.println("**** Removing first and last object****");
		l.remove(0);
		l.remove(l.size()-1);
		System.out.println("List after removal: ");
		System.out.println(l);
		System.out.println("**** Check for null ****");
		if(l.contains(null))
		{
			System.out.println("Yess, null object exists");
		}
		else
		{
			System.out.println(("Oh null object doesn't exist"));
		}
	}

}
