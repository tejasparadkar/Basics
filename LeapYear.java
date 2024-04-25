package programming;

import java.util.Scanner;

//Check leap year or not
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a year: ");
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		if(y%4==0)
		{
			System.out.println("Leap year");
			
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}

}
