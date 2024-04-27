package programming;

import java.util.Scanner;

//WAJP to find product of all digits in number
public class SeperateDigitProduct {
	public static void productDigit(int n)
	{
		int product=1;
		while(n!=0)
		{
			int d = n%10;
			product=product*d;
			n=n/10;
		}
		System.out.println(product);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		System.out.println("Digits are as follows: ");
		productDigit(n);

	}

}
