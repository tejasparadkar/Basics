package array;

import java.util.Scanner;

//WAJP to find the sum of all the digits of the element of the array
public class ArraySumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value");
			a[i]=s.nextInt();
		}
		System.out.println("Sum of digits is: ");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			int b=a[i];
			while(b!=0)
			{
				int d = b%10;
				sum=sum+d;
				b=b/10;
			}
			System.out.println(sum);
		}

	}

}
