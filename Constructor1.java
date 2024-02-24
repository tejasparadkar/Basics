class Constructor1 //understanding basic constructor
{
	static
	{
		System.out.println("SIB-1");
	}
	Constructor1()
	{
		System.out.println("Constructor-1");
	}
	{
		System.out.println("IIB-1");
	}
	Constructor1()
	{
		System.out.println("Constructor-2");
	}
	public static void main(String[] args) 
	{
		Constructor1 ref1= new Constructor1();//Constructor(); is a constructor calling statement
		Constructor1 ref2 = new Constructor1();
		System.out.println(ref1);

	}
}
