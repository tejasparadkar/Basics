package map;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class M3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeMap<Integer,String> t = new TreeMap<>();
		System.out.println("**** Enter values in Integer,String format ****");
		
		for(int i=1;i<=8;i++)
		{
			System.out.println("Enter key and value pair (" + i + "): ");
			System.out.println("Enter key(integer):");
			int j = s.nextInt();
			System.out.println("Enter value(string):");
			s.nextLine();
			String n = s.nextLine();
			t.put(j, n);
		}
		System.out.println("Tree Map" + t);
		System.out.println("Only key" + t.keySet());
		System.out.println("Only values"+t.values());
		System.out.println("One-by-one entries");
		for(Object o:t.entrySet())
		{
			System.out.println(o);
		}
		Set s1 = t.entrySet();
		Iterator i = s1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
