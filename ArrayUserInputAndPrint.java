package array;

import java.util.Scanner;

//WAJP to create array from user input and printing it
public class ArrayUserInputAndPrint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value for "+i+" : ");
			a[i]=s.nextInt();
		}
		System.out.println("Array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
