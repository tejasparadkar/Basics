import java.util.Scanner;
class  ConstructorChainingExample
{
	String name;
	int age;
	String address;
	ConstructorChainingExample()
	{
	}
	ConstructorChainingExample(String name)
	{
		this();
		this.name=name;
	}
	ConstructorChainingExample(String name, int age)
	{
		this(name);
		this.age = age;
	}
	ConstructorChainingExample(String name, int age, String address)
	{
		this(name,age);
		this.address=address;
	}
	public void print_details()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Address is "+address);
	}
	public static void main(String[] args) 
	{
		System.out.println("=====================");
		ConstructorChainingExample r1 = new ConstructorChainingExample();
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter name: ");
		r1.name = ref.next();
		System.out.println("Enter age: ");
		r1.age = ref.nextInt();
		System.out.println("Enter address: ");
		ref.nextLine();
		r1.address = ref.nextLine();
		ConstructorChainingExample r2 = new ConstructorChainingExample(r1.name,r1.age,r1.address);
		r2.print_details();
	}
}
