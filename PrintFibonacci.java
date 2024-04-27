package programming;

import java.util.Scanner;

//Print fibonacci series from 1 to n 
public class PrintFibonacci {
	public static void fibonacci(int n)
	{
		int a=0; 
		int b=1; 
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = s.nextInt();
		fibonacci(n);

	}

}
