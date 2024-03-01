import java.util.Scanner;
class  BankingSystemInitializer
{
	long nonStaticBankId;
	String nonStaticBankName;
	long nonStaticBankBalance;
	static
	{
		System.out.println("Initialization process has begun");
	}
	{
		System.out.println("Banking process has started");
	}
	BankingSystemInitializer()
	{
	}
	BankingSystemInitializer(long nonStaticBankId,	String nonStaticBankName,	long nonStaticBankBalance)
	{
		this.nonStaticBankId=nonStaticBankId;
		this.nonStaticBankName=nonStaticBankName;
		this.nonStaticBankBalance=nonStaticBankBalance;
	}
	public void printBankDetails()
	{
		System.out.println("Bank Details are:");
		System.out.println("BANK ID: "+nonStaticBankId);
		System.out.println("BANK NAME: "+nonStaticBankName);
		System.out.println("BANK BALANCE: "+nonStaticBankBalance);
		System.out.println("Thank YOU for using "+nonStaticBankName);
	}
	public static void main(String[] args) 
	{
		BankingSystemInitializer b1 = new BankingSystemInitializer();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Bank ID: ");
		b1.nonStaticBankId=s1.nextLong();
		System.out.println("Enter Bank Name: ");
		s1.nextLine();
		b1.nonStaticBankName=s1.nextLine();
		System.out.println("Enter Bank Balance: ");
		b1.nonStaticBankBalance=s1.nextLong();
		BankingSystemInitializer b2 = new BankingSystemInitializer(b1.nonStaticBankId,b1.nonStaticBankName,b1.nonStaticBankBalance);
		b2.printBankDetails();
	}
}
