package programming;

import java.util.Scanner;

//WAJP to find neon number
//neon number is a number where the sum of digits of square of 
//the number is equal to the number
//9-->81-->8+1-->9
//e.g. 9,1
public class NeonNumber {
	public static void neon(int n)
	{
		int s=n*n;
		int sum=0;
		while(s!=0)
		{
			int d= s%10;
			sum=sum+d;
			s=s/10;
		}
		if(sum==n)
		{
			System.out.println("Neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		neon(n);

	}

}
