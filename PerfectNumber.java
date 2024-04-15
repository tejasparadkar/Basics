package programming;
//WAJP to check if number is perfect or not
//Perfect numbers are numbers whose sum of factors excluding number is equal to number
import java.util.Scanner;

public class PerfectNumber {
	public static void perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		perfect(n);
	}

}
