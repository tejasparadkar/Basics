class MethodRec8//Print A to Z alternatively 
{
	public static void rec(char a)
	{
		if(a<='Z')
		{
			System.out.println(a);
			++a;
			rec(++a);
		}
	}
	public static void main(String[] args) 
	{
		rec('A');
	}
}
