package programming;

import java.util.Scanner;

//WAJP to find sum of n natural numbers
public class SumOfnNaturalNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find sum:");
		int n =s.nextInt();
		int sum=0;
		for(int i = 1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("******************************");
		sum=0;
		int i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("******************************");
		sum=0;
		i=1;
		do
		{
			sum=sum+i;
			i++;
		}
		while(i<=n);
		System.out.println("Sum is: "+sum);
	}

}
