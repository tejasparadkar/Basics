package Collections;

import java.util.ArrayList;

class Person
{
	int id;
	String name;
	double salary;
	public Person(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+salary;
	}
	
}
public class Collection14 {

	public static void main(String[] args) {
		ArrayList <Person> a = new ArrayList<>();
		a.add(new Person(1,"ABC",10000));
		a.add(new Person(2,"DEF",20000));
		a.add(new Person(3,"GHI",30000));
		for (Object obj : a) {
			Person e =(Person)obj;
			System.out.println(e);
		}
	}

}
