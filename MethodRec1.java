class MethodRec1//Method recursion to print 1 to 100
{
	public static void print(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			print(++num);
		}
	}
	public static void main(String[] args) 
	{
		print(1);
	}
}
