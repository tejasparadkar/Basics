package programming;
//WAJP to convert decimal to binary
import java.util.Scanner;

//1. Decimal - base 10
//0 1 2 3 4 5 6 7 8 9 
//2. binary - base 2
//0 1

public class DecimalToBinary {
	public static void binaryConversion(int n)
	{
		String b="";
		while(n!=0)
		{
			int r = n%2;
			b=r+b;
			n=n/2;
		}
		System.out.println("Binary number is: "+b);
		
	}
	
	
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		binaryConversion(n);
		
	}

}
