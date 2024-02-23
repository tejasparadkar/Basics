class ICICISavingAccount 
{
	String accountholdername;
	long accountNumber;
	double accountBalance;
	static String bankName = "ICICI Bank";
	static
	{
		System.out.println("Login successful");
	}
	{
		System.out.println("ICICI savings account is ready to use");
	}
	public void accountDetails()
	{
		System.out.println("Bank name: "+bankName);
		System.out.println("Account holdername: "+accountholdername);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account balance: "+accountBalance);
		System.out.println("============================");
	}

	public static void main(String[] args) 
	{
		ICICISavingsAccount customer1 = new ICICISavingsAccount();
		customer1.accountholdername="ABC";
		customer1.accountNumber=123243533;
		customer1.accountBalance=23435643;
		customer1.accountDetails();
		ICICISavingsAccount customer2 = new ICICISavingsAccount();
		customer2.accountholdername="DEF";
		customer2.accountNumber=123242432;
		customer2.accountBalance=343562321;
		customer2.accountDetails();
		ICICISavingsAccount customer3 = new ICICISavingsAccount();
		customer3.accountholdername="GHI";
		customer3.accountNumber=132342533;
		customer3.accountBalance=321435643;
		customer3.accountDetails();
	}
}
