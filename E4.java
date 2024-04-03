package exception;
//try-finally block
import java.util.*;

public class E4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount");
		try
		{
			int a = s.nextInt();
		}

		finally {
			System.out.println("Thank you");
		}
		System.out.println("Program ends");
	}

}
