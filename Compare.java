package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int rollno;
	String name;
	double marks;
	int age;
	public Student(int rollno, String name, double marks, int age) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public int compareTo(Student o)
	{
		if(this.age>o.age)
		{
			return 1;
		}
		else if(this.age<o.age)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	@Override
	public String toString() {
		return rollno + " "+ name +" "+marks+" "+age;
	}
}
public class Compare {

	public static void main(String[] args) {
		ArrayList<Student> a =new ArrayList<Student>();
		a.add(new Student(1, "A", 71, 23));
		a.add(new Student(2, "B", 84, 26));
		a.add(new Student(3, "C", 65, 24));
		a.add(new Student(4, "D", 76, 25));
		Collections.sort(a);
		for(Student s:a)
		{
			System.out.println(s);
		}
	}

}
