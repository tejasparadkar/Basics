package programming;
//WAJP to convert decimal to hexaDecimal
import java.util.Scanner;
//1. Decimal - base 10
//0 1 2 3 4 5 6 7 8 9 
//4. Hexadecimal - base 16
//0 1 2 3 4 5 6 7 8 9 A B C D E F
public class DecimalToHexa {
	public static void hexaConversion(int n)
	{
		String b="";
		while(n!=0)
		{
			int r = n%16;
			if(r<10)
			{
				b=r+b;
			}
			else
			{
				//For uppercase ASCII A=65
				//for lowercase ASCII a=97
				b=(char)(r+55)+b;//narrowing int to char
			}
			n=n/16;
		}
		System.out.println("HexaDecimal number is: "+b);
		
	}
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		hexaConversion(n);

	}

}
