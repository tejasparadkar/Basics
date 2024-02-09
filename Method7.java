class Method7 //check whether number is even or not
{
	public static void check(int a)
	{
		System.out.println("Using conditional operator:");
		System.out.println(a%2==0 ? "This number is even" : "This number is not even");
		System.out.println("Using if-else:");
		if(a%2==0)
		{
			System.out.println("This number is even");
		}
		else
		{
			System.out.println("This number is odd");
		}
	}
	public static void main(String[] args) 
	{
		check(21);
	}
}
