package programming;
//WAJP to convert decimal to octal
import java.util.Scanner;

//1. Decimal - base 10
//0 1 2 3 4 5 6 7 8 9 
//3. Octal - base 8
//0 1 2 3 4 5 6 7
public class DecimalToOctal {
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
		octalConversion(n);
		
	}
}
