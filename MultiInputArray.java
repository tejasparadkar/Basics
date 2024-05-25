package arraymultidimension;

import java.util.Scanner;

//WAJP to input data from user for multidimensional array and display it
public class MultiInputArray 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of outer array: ");
		int m=s.nextInt();
		System.out.println("Enter size of inner array: ");
		int n=s.nextInt();
		int a[][]=new int[m][n];
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.println("Enter value at "+i+" "+j+":");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Output is: ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
