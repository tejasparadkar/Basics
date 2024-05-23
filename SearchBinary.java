package sort;

import java.util.Arrays;
import java.util.Scanner;
//WAJP to perform binary search in array
//first sort the array in ascending
//compare the search with middle element
//if larger than middle then move to right side
//if smaller than middle then move to left side
public class SearchBinary 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Array is: ");
		int a[]= {9,5,17,3,1};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter a element to search: ");
		int search=s.nextInt();
		Arrays.sort(a);
		int sp=0;
		int ep=a.length-1;
		while(sp<=ep)
		{
			int mp=(sp+ep)/2;
			if(search==a[mp])
			{
				System.out.println("Element is present at: "+mp);
				break;
			}
			else if(search>a[mp])
			{
				sp=mp+1;
			}
			else
			{
				ep=mp-1;
			}
		}
		if(sp>ep)
		{
			System.err.println("Element is not present in array");
		}
	}

}
