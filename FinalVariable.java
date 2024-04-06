package concepts;

public class FinalVariable 
{
	final static double pi=3.14;//global final keyword
	public static void main(String[] args) 
	{
		System.out.println(pi);
		final double x;
		x=3.5;
		System.out.println(x);

	}

}
