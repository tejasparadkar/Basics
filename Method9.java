class Method9 //smallest of 5 numbers 
{
	public static void smallest(int a, int b, int c, int d, int e)
	{
		if(a<b && a<c && a<d && a<e)
		{
			System.out.println(a);
		}
		else if(b<c && b<d && b<e)
		{
			System.out.println(b);
		}
		else if(c<d && c<e)
		{
			System.out.println(c);
		}
		else if(d<e)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		System.out.print("Smallest number is: ");
		smallest(50,40,30,10,20);
	}
}
