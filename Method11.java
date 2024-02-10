class Method11 //return for largest of 4 numbers
{
	public static double largest(double a, double b, double c, double d)
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
	public static void main(String[] args) 
	{
		System.out.println("Largest number is: ");
		double e = largest(46.5,55.9,-87.88,0);
		System.out.println(e);
		System.out.println(e);
		System.out.println(e);
	}
}
