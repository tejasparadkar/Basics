interface Amaz
{
	abstract public void login();
}
//implementing class 
class Amazon implements Amaz
{
	public void login()
	{
		System.out.println("providing method body/logic/implementation");
	}
}
class AB3
{
	public static void main(String[] args) 
	{
		Amaz ref = new Amazon();
		ref.login();
	}
}
