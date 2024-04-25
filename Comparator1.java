package collectionProgram;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Person
{
	int rollno;
	String name;
	double marks;
	int age;
	public Person(int rollno, String name, double marks, int age) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return rollno + " "+ name +" "+marks+" "+age;
	}
}
class MarksComparator implements Comparator<Person>
{
	@Override
	public int compare(Person o1, Person o2) {
		return (int) (o1.marks-o2.marks);
	}
}
class AgeComparator implements Comparator<Person>
{
	@Override
	public int compare(Person o1, Person o2) {
		return (o1.age-o2.age);
	}
}
public class Comparator1 {

	public static void main(String[] args) {
		ArrayList<Person> a =new ArrayList<Person>();
		a.add(new Person(1, "A", 71, 23));
		a.add(new Person(2, "B", 84, 26));
		a.add(new Person(3, "C", 65, 24));
		a.add(new Person(4, "D", 76, 25));
		MarksComparator m = new MarksComparator();
		Collections.sort(a,m);
		for(Person s:a)
		{
			System.out.println(s);
		}
		System.out.println("----------------------");
		AgeComparator age = new AgeComparator();
		Collections.sort(a,age);
		for(Person s:a)
		{
			System.out.println(s);
		}
	}

}
