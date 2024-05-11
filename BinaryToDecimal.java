package programming;
//WAJP to convert binary to decimal
import java.util.Scanner;

public class BinaryToDecimal {
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
		System.out.println("Decimal number is: "+sum);
	}
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		deciConversion(n);

	}

}
