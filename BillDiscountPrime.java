package programming;
//Add the prime numbers from the bill amount and sum it up
import java.util.Scanner;

public class BillDiscountPrime {
	public static void discount(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int d=a%10;
			if(d==2||d==3||d==5||d==7)
			{
				sum=sum+d;
			}
			a=a/10;
		}
		System.out.println("Discount on bill is: "+sum);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a bill amount: ");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		discount(a);
	}

}
