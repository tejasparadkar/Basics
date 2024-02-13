class MethodRec6//A to Z 
{
	public static void rec(char a)
	{
		if(a<='Z')
		{
			System.out.println(a);
			rec(++a);
		}
	}
	public static void main(String[] args) 
	{
		rec('A');
	}
}
