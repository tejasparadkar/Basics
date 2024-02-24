class Constructor2 //creating a no argument and parameterized constructor 
{
	Constructor2()
	{
		System.out.println("Default constructor");
	}
	Constructor2(String a)
	{
		System.out.println(a);
	}	
	public static void main(String[] args) 
	{
		Constructor2 ref = new Constructor2();
		Constructor2 ref1 = new Constructor2("Parameterized constructor");
	}
}
