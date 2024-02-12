class Largest // largest of numbers using method overloading 
{
	public static int largest(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int largest(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else 
		{
			return c;
		}
	}
	public static int largest(int a, int b, int c, int d)
	{
		if(a>b && a>c && a>d)
		{
			return a;
		}
		else if (b>c && b>d)
		{
			return b;
		}
		else if(c>d)
		{
			return c;
		}
		else
		{
			return d;
		}
	}
	public static int largest(int a, int b, int c, int d, int e)
	{
		if(a>b && a>c && a>d && a>e)
		{
			return a;
		}
		else if (b>c && b>d && b>e)
		{
			return b;
		}
		else if(c>d && c>e)
		{
			return c;
		}
		else if(d>e)
		{
			return d;
		}
		else
		{
			return e;
		}
	}
	public static void main(String[] args) 
	{
		int l1 = largest(10,20);
		System.out.println("Largest of two numbers is "+l1);
		int l2 = largest(10,30,20);
		System.out.println("Largest of three numbers is "+l2);
		int l3 = largest(10,40,20,30);
		System.out.println("Largest of four numbers is "+l3);
		int l4 = largest(10,20,40,15,30);
		System.out.println("Largest of five numbers is "+l2);
	}
}
