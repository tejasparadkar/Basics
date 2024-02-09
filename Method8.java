class Method8//finding largest of three numbers
{
	public static void largest(int a, int b, int c)
	{
		if (a>b && a>c)
		{
			System.out.print("Largest number is: ");
			System.out.println(a);
		}
		else if(b>a  && b>c)
		{
			System.out.print("Largest number is: ");
			System.out.println(b);
		}
		else if(c>a && c>b)
		{
			System.out.print("Largest number is: ");
			System.out.println(c);
		}
	}
	public static void main(String[] args) 
	{
		largest(35,-10,-5);
	}
}
