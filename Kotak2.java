import java.util.Scanner;

class Visa
{
	{
	System.out.println("Your credit card is used");
	}
	double balance;
	double expense;
	public void swipe(double balance, double expense)
	{
		
		System.out.println("Expense is :"+balance);
		System.out.println("Balance is: "+expense);
	}
}
class Kotak2 
{

	public static void main(String[] args) 
	{
		
		Visa v1 = new Visa();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter amount spent: ");
		v1.expense = s1.nextDouble();
		v1.balance = 2000000 - v1.expense;
		v1.swipe(v1.expense, v1.balance);
	}
}
