class MethodRec //Method recursion for incrementing numbers
{
	public static void rec(int num)
	{
		if(num<=2222)
		{
			System.out.println(num);
			rec(++num);
		}
	}
	public static void main(String[] args) 
	{
		rec(22);
	}
}
