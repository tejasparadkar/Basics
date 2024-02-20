class ICICIBankSavingsAccount //printing account details of three users
{
	static String bankname="ICICI";
	String accountname;
	double balance;
	public static void accountDetails(String a, double b)
	{
		System.out.println("Bank name: "+bankname);
		System.out.println("Account holder name: "+a);
		System.out.println("Account balance: "+b);
	}
	public static void main(String[] args) 
	{
		ICICIBankSavingsAccount acc1=new ICICIBankSavingsAccount ();
		acc1.accountname="Tejas";
		acc1.balance=1234563;
		accountDetails(acc1.accountname,acc1.balance);
		
		ICICIBankSavingsAccount acc2=new ICICIBankSavingsAccount ();
		acc2.accountname="XYZ";
		acc2.balance=874837324;
		accountDetails(acc2.accountname,acc2.balance);
		
		ICICIBankSavingsAccount acc3=new ICICIBankSavingsAccount ();
		acc3.accountname="ABC";
		acc3.balance=487286287;
		accountDetails(acc3.accountname,acc3.balance);
	}
}
