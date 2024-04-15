package programming;

import java.util.Scanner;

public class SumOfFactors {
	public static void factor(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		factor(n);

	}

}
