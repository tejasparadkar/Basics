package programming;

import java.util.Scanner;

//WAJP to find LCM of two numbers
//LCM=a*b/GCD(a,b)
public class LCM {
	public static void lcm(int m,int n)
	{
		int gcd=1;
		for(int i=1;i<=m;i++)
		{
			if(m%i==0&&n%i==0)
			{
				gcd=i;
			}
		}
		int lcm=(m*n)/gcd;
		System.out.println("LCM of "+m+" & "+n+" is "+lcm);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number 1 : ");
		int m = s.nextInt();
		System.out.println("Enter a number 2: ");
		int n = s.nextInt();
		lcm(m,n);
	}

}
