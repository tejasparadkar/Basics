class  P1//static variables,methods,blocks tracing
{
	static char a;
	static boolean b;
	public static void Qspiders()
	{
		System.out.println("QSP begins");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a='a';
		b=true;
		Jspiders();
		System.out.println("QSP ends");
	}
	public static void Jspiders()
	{
		System.out.println("JSP begins");
		System.out.println("a:" +a);
		System.out.println("b: "+b);
		a='b';
		b=false;
		System.out.println("JSP ends");
	}
	static
	{
		System.out.println("SIB-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main begins");
		char a='a';
		Qspiders();
		System.out.println("a: "+a);
		System.out.println("a: "+P1.a);
		System.out.println("b: "+b);
		System.out.println("Main ends");
	}
	static
	{
		System.out.println("SIB-2");
		Jspiders();
	}
}
