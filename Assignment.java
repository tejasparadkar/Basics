class Animal
{
	static int i=15;
	public static void test()
	{
		System.out.println("Test Superclass");
		System.out.println("i: "+i);
	}
}
class Monkey extends Animal
{
	static int i=25;
	public static void test()
	{
		System.out.println("Test Subclass");
		System.out.println("i: "+i);
	}
}
class Assignment 
{
	public static void main(String[] args) 
	{
		Animal.test();
		Monkey.test();
	}
}
