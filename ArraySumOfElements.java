package array;

import java.util.Scanner;

//WAJP to find sum of array elements by taking user input
public class ArraySumOfElements {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n =s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value: ");
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of all elements is: "+sum);
	}

}
