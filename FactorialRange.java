package programming;

import java.util.Scanner;

//WAJP to find factorial of number between m to n
public class FactorialRange {
	public static void factorial(int m,int n)
	{
		int fact=1;
		for(int i=m;i<=n;i++)
		{
			System.out.println("***********************");
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" is: "+fact);
			fact=1;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting range");
		int m = s.nextInt();
		System.out.println("Enter ending range");
		int n = s.nextInt();
		factorial(m,n);

	}

}
