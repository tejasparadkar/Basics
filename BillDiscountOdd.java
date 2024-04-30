package programming;

import java.util.Scanner;

//take input bill amount
//discount = sum of all odd digits in total bill amount 
//if no odd digit discount 0
public class BillDiscountOdd {
	public static void discount(int a)
	{
		int discount = 0;
		while(a!=0)
		{
			int d=a%10;
			if(d%2!=0)
			{
				discount=discount+d;
			}
			a=a/10;
		}
		System.out.println("Discount on your bill is: "+discount);
	}
	public static void main(String[] args) {
	System.out.println("Enter bill amount: ");
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	discount(a);

	}

}
