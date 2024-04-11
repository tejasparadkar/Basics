package programming;

import java.util.Scanner;

//WAJP to print table of n 
public class TableOfN{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find table: ");
		int n=s.nextInt();
		System.out.println("Table of "+n+" is as follows:");
		for(int i=1;i<=10;i++)
		{
			int product=n*i;
			System.out.println(n+"x"+i+"="+product);
		}
	}
}
