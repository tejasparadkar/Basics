package programming;
//WAJP to display only even digits of a number
import java.util.ArrayList;
import java.util.Scanner;

public class SeperateEvenDigits {
	public static void digit(int n)
	{
		ArrayList<Integer> a = new ArrayList<>();
		while(n!=0)
		{
			int d = n%10;
			if(d%2==0)
			{
				a.add(d);
			}			
			n=n/10;
		}
		for(int i=a.size()-1;i>=0;i--)
		{
			System.out.println(a.get(i));
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		System.out.println("Digits are as follows: ");
		digit(n);

	}

}
