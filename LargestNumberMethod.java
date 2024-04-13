package programming;

import java.util.Scanner;

//WAJP to check largest number from three user input numbers
public class LargestNumberMethod {
	public static void largest(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Largest number is: "+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("Largest number is: "+b);
		}
		else if(c>b && c>a)
		{
			System.out.println("Largest number is: "+c);
		}
		else
		{
			System.out.println("Numbers are equal");
		}
	}
	public static void conditional(int a,int b,int c)
	{
		System.out.println(((a>b)&&(a>c))?"Largest number is: "+a:(((b>c)&&(b>a))?"Largest number is: "+b:((c>b)&&(c>a))?"Largest number is: "+c:"Numbers are equal"));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = s.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = s.nextInt();
		System.out.println("Enter 3rd number: ");
		int c = s.nextInt();
		largest(a, b, c);
		conditional(a, b, c);
	}

}
