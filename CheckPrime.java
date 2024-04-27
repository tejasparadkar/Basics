package programming;
//check prime number
import java.util.Scanner;

public class CheckPrime {
	public static void prime(int n)
	{
		int count =2;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Composite Number / Not a Prime Number");
		}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		if(n==0||n==1)
		{
			System.out.println("Neither a Prime Number nor Composite number");
		}
		else
		{
			prime(n);
		}
		

	}

}
