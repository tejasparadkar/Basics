package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		try 
		{
			int a =s.nextInt();
			int b= 20;
			System.out.println(b/a);
		} 
		catch (InputMismatchException e) {
			System.out.println("Enter correct number");
		}
		catch (ArithmeticException e) {
			System.out.println("Do not enter o");
		}
		

	}

}
