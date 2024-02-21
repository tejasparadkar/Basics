class  This//using this keyword
{
	public void m1()
	{
		System.out.println("Hi");
		System.out.println("this keyword: "+this);
		System.out.println("bye");
	}

	public static void main(String[] args) 
	{
		System.out.println("MB");
		This ref = new This();
		System.out.println("Object address: "+ref);
		ref.m1();
		System.out.println("ME");
	}
}
