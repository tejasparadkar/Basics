package programming;

import java.util.Scanner;

//Sum of odd digits and sum of even digits and multiply them with each other
public class SumOFEvenAndOdd {
	public static void sum(int a)
	{
		int sumEven=0;
		int sumOdd=0;
		int multiply=1;
		while(a!=0)
		{
			int d=a%10;
			if(d%2==0)
			{
				sumEven=sumEven+d;
			}
			else
			{
				sumOdd=sumOdd+d;
			}
			a=a/10;
		}
		multiply=sumEven*sumOdd;
		System.out.println("Sum of Even Numbers: "+sumEven);
		System.out.println("Sum of odd Numbers: "+sumOdd);
		System.out.println("Multiplication is: "+multiply);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		sum(a);

	}

}
