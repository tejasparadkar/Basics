import java.util.Scanner;
class ATM
{
	int money;
	public void withdraw(int money)
	{
		System.out.println("Withdrwal amount is "+money);
	}
}

class  Kotak1 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to ATM");
		ATM ref1= new ATM();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter money to be withdrawn: ");
		ref1.money = s1.nextInt();
		ref1.withdraw(ref1.money);
	}
}
