package programming;

import java.util.Scanner;

//print prime numbers from 1 to n
public class PrintPrime {
	public static void prime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i!=0&&i!=1)
			{
				int count =2;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						count++;
					}
					
				}
				if(count==2)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = s.nextInt();
		prime(n);
		

	}

}
