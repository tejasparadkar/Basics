package concepts;

class C
{
	final public static void test()
	{
		System.out.println("Class A1");
	}
}

class D extends C
{
//	public static void test()--> Compile Time Error
//	{
//		System.out.println("Class B1");
//	}
}

public class FinalMethod 
{
	public static void main(String[] args) 
	{
		D ref1 = new D();
		ref1.test();
		C ref2 = new D();
		ref2.test();
	}
}
