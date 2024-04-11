package programming;

import java.util.Scanner;

//WAJP to find Odd number between m to n user has to input m to n
public class CheckOddInputRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int m = s.nextInt();
		System.out.println("Enter ending number: ");
		int n = s.nextInt();
		System.out.println("Odd numbers are: ");
		for(int i=m;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		System.out.println("*******************************");
		int i=m;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
			i++;
		}
		System.out.println("*******************************");
		i=m;
		do
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
			i++;
		}
		while(i<=n);
		
	}

}
