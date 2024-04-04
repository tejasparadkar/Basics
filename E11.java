package exception;

import java.util.Scanner;

class InvalidMobileNumberException extends RuntimeException
{
}

class Form
{
	long mno;

	public Form(long mno) {
		if(mno>99999999&&mno<10000000000L )
		{
			this.mno = mno;
			System.out.println("You've entered correct mobile number");
		}
		else
		{
			throw new InvalidMobileNumberException();
		}
		
	}
	
}

public class E11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mobile number");
		long mno = s.nextLong();
		Form f = new Form(mno);

	}

}
