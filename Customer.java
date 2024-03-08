import java.util.Scanner;
class  ICICIBank
{
	private String branch;
	private String ifscCode;
	public String getBranch()
	{
		return branch;
	}
	public String getIfscCode()
	{
		return ifscCode;
	}
	ICICIBank(String branch,	String ifscCode)
	{
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
}
class LoanAccount extends ICICIBank
{
	private long loanAmount;
	private double loanTenure;
	public long getLoanAmount()
	{
		return loanAmount;
	}
	public double getLoanTenure()
	{
		return loanTenure;
	}
	LoanAccount(String branch,String ifscCode, long loanAmount,double loanTenure)
	{
		super(branch, ifscCode);
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
	}
	public void details()
	{
		System.out.println("======================");
		System.out.println("Branch: "+getBranch());
		System.out.println("IFSCcode: "+getIfscCode());
		System.out.println("Loan Amount: "+getLoanAmount());
		System.out.println("Loan Tenure: "+getLoanTenure());
		System.out.println("======================");

	}
}
class CurrentAccount extends ICICIBank
{
	private String accHolderName;
	private long accNumber;
	public String getAccHolderName()
	{
		return accHolderName;
	}
	public long getAccNumber()
	{
		return accNumber;
	}
	CurrentAccount(String branch,String ifscCode, String accHolderName, long accNumber)
	{
		super(branch, ifscCode);
		this.accHolderName=accHolderName;
		this.accNumber=accNumber;
	}
	public void details()
	{
		System.out.println("======================");
		System.out.println("Branch: "+getBranch());
		System.out.println("IFSCcode: "+getIfscCode());
		System.out.println("Account Holder Name: "+getAccHolderName());
		System.out.println("Account Number: "+getAccNumber());
		System.out.println("======================");
	}
}
class Customer
{
	static String a;
	static String b;
	static long c;
	static double d;
	static String e;
	static long f;
	public static void getLoan()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("*****Enter Loan Details******");
		System.out.println("Enter Bank name: ");
		a=s.nextLine();
		System.out.println("Enter IFSC code: ");
		b=s.nextLine();
		System.out.println("Enter loan amount: ");
		c=s.nextLong();
		System.out.println("Enter loan tenure: ");
		d=s.nextDouble();
	}
	public static void getCurrent()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("*****Enter Current Account Details******");
		System.out.println("Enter Bank name: ");
		a=s.nextLine();
		System.out.println("Enter IFSC code: ");
		b=s.nextLine();
		System.out.println("Enter account holder name: ");
		e=s.nextLine();
		System.out.println("Enter account number: ");
		f=s.nextLong();
	}
	public static void main(String[] args) 
	{
		getLoan();	
		LoanAccount c1 = new LoanAccount(a,b,c,d);
		c1.details();
		getLoan();	
		LoanAccount c2 = new LoanAccount(a,b,c,d);
		c2.details();
		getLoan();	
		LoanAccount c3 = new LoanAccount(a,b,c,d);
		c3.details();
		getCurrent();
		CurrentAccount c4 = new CurrentAccount(a,b,e,f);
		c4.details();
		getCurrent();
		CurrentAccount c5 = new CurrentAccount(a,b,e,f);
		c5.details();
		getCurrent();
		CurrentAccount c6 = new CurrentAccount(a,b,e,f);
		c6.details();
	}
}