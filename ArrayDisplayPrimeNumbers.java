package array;

import java.util.Scanner;

//WAJP to print all the prime numbers in array
public class ArrayDisplayPrimeNumbers {
	public static boolean isPrime(int n)
	{
		int b=n;
		int count=2;
		if(b!=0 && b!=1)
		{
			for(int j=2;j<=b/2;j++)
			{
				if(b%j==0)
				{
					count++;
				}
			}
			
		}
		return count==2?true:false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Prime numbers in array are: ");
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}

	}

}
