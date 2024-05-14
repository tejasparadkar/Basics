package array;

import java.util.Scanner;

//WAJP to reverse each element of the array
//Input- 47,23,64
//Output-74,32,46
public class ArrayReverseElement {

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
		System.out.println("Reverse elements are: ");
		for(int i=0;i<a.length;i++)
		{
			int b = a[i];
			int rev=0;
			while(b!=0)
			{
				int d = b%10;
				rev=rev*10+d;
				b=b/10;
			}
			a[i]=rev;
			System.out.print(rev+" ");
		}
		System.out.println("Reverse elements in array are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
