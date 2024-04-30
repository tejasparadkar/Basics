package programming;

import java.util.Scanner;

//Harshad number is a number that is divisible by its sum of digits
public class HarshadNumber {
	public static void checkHarshad(int n,int sum)
	{
		if(n%sum==0)
		{
			System.out.println("It is a Harshad number");
		}
		else
		{
			System.out.println("It is not a Harshad Number");
		}
	}
	public static void harshad(int n)
	{
		int sum=0;
		int n1=n;
		while(n1!=0)
		{
			int d=n1%10;
			sum=sum+d;
			n1=n1/10;
		}
		checkHarshad(n,sum);
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		harshad(n);
	}

}
