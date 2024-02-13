class MethodRec4//print 11 to 111 only odd nos 
{
	public static void rec(int num)
	{
		if(num<=111)
		{
			if(num%2!=0)
			{
				System.out.println(num);
			}
		rec(++num);
		}
	}
	public static void main(String[] args) 
	{
		rec(11);
	}
}
