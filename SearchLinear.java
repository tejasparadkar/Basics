package sort;

import java.util.Scanner;

//WAJP to perform linear/sequential search in array
public class SearchLinear {
	public static void printArray(int a[])
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Array is: ");
		int a[]= {9,5,17,3,1};
		printArray(a);
		System.out.println("Enter a element to search: ");
		int search=s.nextInt();
		int i=0;
		for (; i < a.length; i++) 
		{
			if(a[i]==search)
			{
				System.out.println("Element found at index: "+i);
				break;
			}
		}
		if(i==a.length)
		{
			System.err.println("Element not present");
		}

	}

}
