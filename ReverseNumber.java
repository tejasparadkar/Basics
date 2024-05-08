package programming;
//WAJP to reverse a number
//123 becomes 321
import java.util.Scanner;

public class ReverseNumber {
	public static void reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println("Reverse number is: "+rev);
	}
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		reverse(n);

	}

}
