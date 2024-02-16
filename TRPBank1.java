class TRPBank1//static members 
{
	static String name;
	static long balance;
	public static void bank()
	{
		System.out.println("Bank Begins");
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		name = "Sheela";
		balance=7654627L;
		System.out.println("Bank ends");
	}
	static
	{
		System.out.println("SIB1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begins");
		char name='a';
		bank();
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println("Main ends");
	}
	static
	{
		System.out.println("SIB2");
	}
}
