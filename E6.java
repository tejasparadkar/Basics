package exception;
//try-catch-finally
import java.util.*;

public class E6 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount");
		try
		{
			int a = s.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Enter only number");
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Thank you");
		}
		System.out.println("Program ends");
	}

}
