class  Constructors//printing 5 constructors
{
	Constructors()
	{
		System.out.println("Default/ no argument constructor");
	}
	Constructors(int a)
	{
		System.out.println("First number is: "+a);
	}
	Constructors(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers: "+ c);
	}
	Constructors(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("Addition of three numbers: "+d );
	}
	Constructors(int a,int b, int c, int d)
	{
		int e=a+b+c+d;
		System.out.println("Addition of four numbers: "+ e);
	}
	public static void main(String[] args) 
	{
		Constructors ref1 = new Constructors(10,20,30);
		Constructors ref2 = new Constructors();
		Constructors ref3 = new Constructors(10,20,30,40);
		Constructors ref4 = new Constructors(10,20);
		Constructors ref5 = new Constructors(10);
	}
}
