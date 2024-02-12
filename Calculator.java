class  Calculator//addition of multiple actual arguments
{
	public static int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	public static int add(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
	public static int add(int a, int b, int c, int d)
	{
		int e = a + b + c + d;
		return e;
	}
	public static int add(int a, int b, int c, int d, int e)
	{
		int f = a + b + c + d +e;
		return f;
	}
	public static int add(int a, int b, int c, int d, int e, int f)
	{
		int g = a + b + c + d + e + f;
		return g;
	}
	public static void main(String[] args) 
	{
		int add1 = add(10,20); 
		System.out.print("Addition of two numbers is: ");
		System.out.println(add1);
		
		int add2 = add(10,20,30); 
		System.out.print("Addition of three numbers is: ");
		System.out.println(add2);

		int add3 = add(10,20,30,40); 
		System.out.print("Addition of four numbers is: ");
		System.out.println(add3);

		int add4 = add(10,20,30,40,50); 
		System.out.print("Addition of five numbers is: ");
		System.out.println(add4);

		int add5 = add(10,20,30,40,50,60); 
		System.out.print("Addition of six numbers is: ");
		System.out.println(add5);
	}
}
