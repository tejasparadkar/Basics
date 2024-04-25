package programming;

import java.util.Scanner;

//Given a number n, for each integer i in the range from 1 to n inclusive, 
//print out one value per line as follows:
//if i is a multiple of both 3 and 5, print FizzBuzz
//if i is a multiple of 3(but not 5), print Fizz
//if i is a multiple of 5(but not 3), print Buzz
//if i is not a multiple of 3 or 5, print the value of i
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0&&i%5!=0)
			{
				System.out.println("Fizz");
			}
			else if(i%3!=0&&i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
