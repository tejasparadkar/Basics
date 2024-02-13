class MethodRec2 //8765 to 65 
{
	public static void rec(int num)
	{
		if(num>=65)
		{
			System.out.println(num);
			rec(--num);
		}
	}
	public static void main(String[] args) 
	{
		rec(8765);
	}
}
