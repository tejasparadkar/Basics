package programming;
//print particular fibonacci series number
import java.util.Scanner;

public class PrintParticularFibonacci {
	public static void fibonacci(int n)
	{
		if(n==1)
		{
			System.out.println("0");
		}
		else if(n==2)
		{
			System.out.println("1");
		}
		else {
			int a=0; 
			int b=1; 
			int c=0;
			for(int i=1;i<=n-2;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
		
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter location: ");
		int n = s.nextInt();
		fibonacci(n);

	}

}
