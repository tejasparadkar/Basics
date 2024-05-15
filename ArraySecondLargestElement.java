package array;

import java.util.Scanner;

//WAJP to find the second largest element in the array
public class ArraySecondLargestElement {

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
		int secondLarge=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
				
			}
			if(a[i]>secondLarge)
			{
				if(a[i]<large && a[i]!=large)
				{
					secondLarge=a[i];
				}
			}
		}
		System.out.println("Second Largest element is: "+secondLarge);

	}

}
