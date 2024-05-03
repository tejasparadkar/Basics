package programming;

import java.util.Scanner;

//Number whose sum of product and sum of digits is equal to number itself
//e.g. 19,29,39,49,59,69,79,89,99
public class SpecialNumber {
	public static void special(int n)
	{
		int temp=n;
		int sum=0;
		int product=1;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			product=product*d;
			n=n/10;
		}
		if(temp==sum+product)
		{
			System.out.println("Special Number");
		}
		else
		{
			System.out.println("Not a special number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		special(n);

	}

}
