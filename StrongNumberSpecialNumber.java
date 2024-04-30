package programming;
//special number whose sum of the factorial of digits is equal to the original number. 
//For Example: 145 is strong number. Since, 1! + 4! + 5! = 145.
//Strong number and special number are same
import java.util.Scanner;

public class StrongNumberSpecialNumber {
	public static void strong(int n)
	{
		int sum=0;
		int n1=n;
		int fact=1;
		while(n1!=0)
		{
			  int d = n1%10;
			  for(int i=d;i>=1;i--)
			  {
				  fact=fact*i; 
				  
			  }
			  sum=sum+fact;
			  fact=1;
			  n1=n1/10;
		}
		if(sum==n)
		{
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		strong(n);
	}

}
