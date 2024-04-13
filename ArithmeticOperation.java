package programming;

import java.util.Scanner;

//WAJP to perform all the arithmetic operations by taking input from user
public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a= s.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = s.nextInt();
		System.out.println("Addition of two numbers is: "+(a+b));
		System.out.println("Subtraction of two numbers is: "+(a-b));
		System.out.println("Multiplication of two numbers is: "+(a*b));
		System.out.println("Division of two numbers is: "+(a/b));
		System.out.println("Modulus of two numbers is: "+(a%b));

	}

}
