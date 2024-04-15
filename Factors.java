package programming;

import java.util.Scanner;

//WAJP to find factors of number
public class Factors {
	public static void factor(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		factor(n);
		
		
	}

}
