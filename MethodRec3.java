class MethodRec3//100 to 0 
{
	public static void rec(int num)
	{
		if(num>=0)
		{
			System.out.println(num);
			rec(--num);
		}
	}
	public static void main(String[] args) 
	{
		rec(100);
	}
}
