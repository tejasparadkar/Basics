package Collections;

import java.util.ArrayList;

public class Collection4 {

	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		s.add("Idli");
		s.add("Vada");
		s.add("Mysore Masala Dosa");
		s.add("Utappa");
		s.add("appam");
		System.out.println("South Indian: "+s);
		
		ArrayList m = new ArrayList();
		m.add("pav");
		m.add("Modak");
		m.add("Pohe");
		m.add("Puran Poli");
		m.add("Thecha");
		System.out.println("Maharashtrian: "+m);
		
		s.add("Dum Biryani");
		m.add(0,"Shikran");
		System.out.println("South Indian: "+s);
		System.out.println("Maharashtrian: "+m);
		
		m.addAll(s);
		s.addAll(4, m);
		System.out.println("South Indian: "+s);
		System.out.println("Maharashtrian: "+m);
		
		System.out.println("Search: "+m.contains("idli"));
		System.out.println("Search: "+s.containsAll(m));
		
		m.remove("Dum Biryani");
		m.remove(4);
		System.out.println("Maharashtrian: "+m);
		
		m.clear();
		System.out.println("Maharashtrian: "+m);

	}

}
