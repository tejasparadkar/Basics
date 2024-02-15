class  Static
{
	static boolean b;
	static char c;
	public static void main(String[] args) 
	{
		String c = "Hello";
		System.out.println("Before static variable initialization");
		System.out.println(Static.b);
		System.out.println(Static.c);
		System.out.println(c);
		Static.b = true;
		Static.c = 'H';
		System.out.println("After static variable initialization");
		System.out.println(Static.b);
		System.out.println(Static.c);
		System.out.println(c);
		
	}
}
