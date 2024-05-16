package array;

import java.util.Scanner;

//WAJP to find the third smallest element of array
public class ArrayThirdSmallest {

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
		int smallest=a[0];
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];				
			}
		}		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];				
			}
			
		}
		int secondSmallest=largest;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<secondSmallest && a[i]>smallest)
			{
					secondSmallest=a[i];
			}
		}
		int thirdSmallest=largest;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<thirdSmallest && a[i]>smallest && a[i]>secondSmallest)
			{
					thirdSmallest=a[i];
			}
		}
		
		System.out.println("Smallest element is: "+smallest);
		System.out.println("Second Smallest element is: "+secondSmallest);
		System.out.println("Third Smallest element is: "+thirdSmallest);


	}

}
