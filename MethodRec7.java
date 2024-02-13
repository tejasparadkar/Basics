class MethodRec7//Z to A print only alternate characters
{
	public static void rec(char a)
	{
		if(a>='A')
		{
			System.out.println(a);
			--a;
			rec(--a);
			
		}
		
	}		
	public static void main(String[] args) 
	{
		rec('Z');
	}
}
