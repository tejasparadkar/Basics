import java.util.Scanner;
class ATM
{
	private int money=10000;

	public int getMoney()
	{
		return money;
	}
	public void setMoney(int money)
	{
		this.money=money;
	}
	public void withdraw()
	{
		System.out.println("U can withdraw cash");
	}
}
class Kotak3 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		ATM a1 = new ATM();
		a1.setMoney(1300000);
		System.out.println("New withdrawal amount is : " + a1.getMoney());
		a1.withdraw();
	}
}
