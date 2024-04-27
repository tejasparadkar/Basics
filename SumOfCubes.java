package questions;

import java.util.Scanner;

public class SumOfCubes {
	public static int cube(int m, int n)
	{
		int sum=0;
		int cube=1;
		for(int i=m;i<=n;i++)
		{
			for(int j=i;j<=i;j++)
			{
				cube=j*j*j;
			}
			sum=sum+cube;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int m = s.nextInt();
		System.out.println("Enter ending range: ");
		int n = s.nextInt();
		System.out.println("Sum of cubes in range "+m+" to "+n+" is: "+cube(m,n));

	}

}
