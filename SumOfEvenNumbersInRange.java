package programming;

import java.util.Scanner;

//WAJP to find sum of even numbers between m to n 
public class SumOfEvenNumbersInRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int m = s.nextInt();
		System.out.println("Enter ending number: ");
		int n = s.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers is: "+sum);
		System.out.println("*******************************");
		sum=0;
		int i=m;
		while(i<=n)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum of even numbers is: "+sum);
		System.out.println("*******************************");
		sum=0;
		i=m;
		do
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		while(i<=n);
		System.out.println("Sum of even numbers is: "+sum);
	}

}
