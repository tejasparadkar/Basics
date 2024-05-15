package array;

import java.util.Scanner;

//WAJP to print the binary representation of each element in array by taking user input
public class ArrayBinaryRep {
	public static String binary(int n)
	{
		String b="";
		int c=n;
		while(c!=0)
		{
			int d=c%2;
			b=d+b;
			c=c/2;
		}
		return b;
	}
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
		System.out.println("Binary digits are: ");
		for(int i=0;i<a.length;i++)
		{			
			System.out.println(binary(a[i]));
		}
		
	}

}
