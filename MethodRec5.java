class MethodRec5//1 to 100 only even nos. 
{
	public static void rec(int num)
	{
		if(num<=100)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
			rec(++num);
		}
	}
	public static void main(String[] args) 
	{
		rec(1);
	}
}
