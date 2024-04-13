package programming;

import java.util.Scanner;

//WAJP to find even number between m to n with help of methods
public class EvenNumberRangeMethod {
	public static void checkEven(int a, int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a starting range: ");
		int a = s.nextInt();
		System.out.println("Enter a ending range: ");
		int b = s.nextInt();
		checkEven(a,b);

	}

}
