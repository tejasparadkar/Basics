package array;

import java.util.Scanner;

//WAJP to find the largest element in the array
public class ArrayLargestElement {

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
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("Largest element is: "+large);

	}

}
