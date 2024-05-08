package programming;

import java.util.Scanner;

//A spy number is a number whose sum and product of digits is equal
//e.g.123
public class SpyNumber {
	public static void spy(int n)
	{
		int sum=0;
		int product=1;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			product=product*d;
			n=n/10;
		}
		if(sum==product)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a spy number");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		spy(n);

	}

}
