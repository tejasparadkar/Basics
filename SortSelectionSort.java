package sort;

import java.util.Iterator;

//WAJP to perform selection sort
public class SortSelectionSort {
	public static void printArray(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) 
	{
		int a[]= {9,5,17,3,1};
		System.out.println("Ascending order");
		for (int i = 0; i < a.length; i++) 
		{
			int smallest=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[smallest])
				{
					smallest=j;
				}
			}
			int temp=a[i];
			a[i]=a[smallest];
			a[smallest]=temp;
		}
		printArray(a);
		System.out.println("Descending order");
		for (int i = 0; i < a.length; i++) 
		{
			int largest=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]>a[largest])
				{
					largest=j;
				}
			}
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
		}
		printArray(a);

	}

}
