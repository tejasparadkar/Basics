package programming;

import java.util.Scanner;

//WAJP to find sum of n natural numbers using method
public class SumOfNNaturalNumbersMethod {
	public static void sum(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is: "+sum);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for addition: ");
		int a= s.nextInt();
		sum(a);
	}

}
