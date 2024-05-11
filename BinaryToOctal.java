package programming;
//WAJP to convert binary to octal
import java.util.Scanner;

public class BinaryToOctal {
	public static void deciConversion(int n)
	{
		int sum=0;
		int power=1;
		int base=2;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d*power;
			power=power*base;
			n=n/10;
		}
		octalConversion(sum);
	}
	public static void octalConversion(int n)
	{
		String b="";
		while(n!=0)
		{
			int r = n%8;
			b=r+b;
			n=n/8;
		}
		System.out.println("Octal number is: "+b);		
	}
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		deciConversion(n);
	}

}
