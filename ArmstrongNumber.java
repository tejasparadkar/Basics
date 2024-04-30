package programming;

import java.util.Scanner;

//WAJP to find Armstrong number of n....
//number that is equal to the sum of cubes of its digits
public class ArmstrongNumber {
	public static void armstrong(int n)
	{
		int sum=0;
		int n1=n;
		while(n1!=0)
		{
			int d = n1%10;
			int cube=d*d*d;
			sum=sum+cube;
			n1=n1/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		armstrong(n);

	}

}
