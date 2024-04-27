package programming;
//WAJP to find GCD/HCF of numbers
import java.util.Scanner;

public class GCD {
	public static void gcd(int m,int n)
	{
		int gcd=1;
		for(int i=1;i<=m;i++)
		{
			if(m%i==0&&n%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD of "+m+" & "+n+" is "+gcd);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number 1 : ");
		int m = s.nextInt();
		System.out.println("Enter a number 2: ");
		int n = s.nextInt();
		gcd(m,n);

	}

}
