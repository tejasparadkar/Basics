package programming;
//WAJP to find pallindrome number
//Pallindrome is a number which is equal to its own reverse number.
//e.g.12321,123321
import java.util.Scanner;

public class PallindromeNumber {
	public static void pallindrome(int n)
	{
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int d= n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Pallindrome number");
		}
		else
		{
			System.out.println("Not a Pallindrome number");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		pallindrome(n);

	}

}
