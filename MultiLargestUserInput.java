package arraymultidimension;

import java.util.Scanner;

//WAJP to find largest element from multidimensional user input
public class MultiLargestUserInput 
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
		for (int i = 0; i < a.length; i++) 
		{
			int largest=a[i][0];
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j]>largest)
				{
					largest=a[i][j];
				}
			}
			System.out.println(largest);
		}

	}

}
