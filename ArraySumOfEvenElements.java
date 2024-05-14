package array;

import java.util.Scanner;

//WAJP to find sum of even elements of array take user input
public class ArraySumOfEvenElements {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value: ");
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2==0)
			{
				sum=sum+a[j];
			}
		}
		System.out.println("Sum of even elements is: "+sum);
	}

}
