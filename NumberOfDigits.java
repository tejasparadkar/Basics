package programming;

import java.util.Scanner;

public class NumberOfDigits {
	public static int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			int d=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Number of digits are: "+ countDigit(n));
	}

}
