package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

class Student
{
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return rollNo+" "+name+" "+marks;
	}
	
}
public class Collection15 {

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1,"ABC",90));
		a.add(new Student(2,"DEF",100));
		a.add(new Student(3,"GHI",50));
		a.add(new Student(4,"JKL",70));
		a.add(new Student(5,"MNO",80));
		ListIterator l=a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
	}

}
