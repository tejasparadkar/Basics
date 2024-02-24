class Student //constructor overloading
{
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(int a)
	{
		System.out.println("1 parameterized constructor");
	}
	Student(int a, int b)
	{
		System.out.println("2 parameterized constructor");
	}
	Student(int a, int b, int c)
	{
		System.out.println("3 parameterized constructor");
	}
	Student(int a, int b, int c, int d)
	{
		System.out.println("4 parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student(10);
		Student s3=new Student(10,20);
		Student s4=new Student(10,20,30);
		Student s5=new Student(10,20,30,40);
	}
}
