package programming;

import java.util.Scanner;

//A number is called happy if it leads to 1 after a sequence of steps 
//wherein each step number is replaced by the sum of squares of its digit 
//that is if we start with Happy Number and keep replacing it with digits square sum, 
//we reach 1. 
//e.g. 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, and 100.
public class HappyNumber {
	public static int sumOfSquare(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+(d*d);
			n=n/10;
		}
		return sum;
			
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		while(n!=1 && n!=4)
		{
			n=sumOfSquare(n);
		}
		if(n==1)
		{
			System.out.println("Happy number");
		}
		else
		{
			System.out.println("Not a happy number");
		}
		
	}

}
