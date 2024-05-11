package programming;

import java.util.Scanner;

//WAJP to convert octal to decimal
public class OctalToDecimal {
	public static void deciConversion(int n)
	{
		int sum=0;
		int power=1;
		int base=8;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d*power;
			power=power*base;
			n=n/10;
		}
		System.out.println("Decimal number is: "+sum);
	}
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		deciConversion(n);

	}
}
