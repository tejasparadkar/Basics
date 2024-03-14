abstract class Amaz
{
	abstract public void login();
}
class Amazon extends Amaz
{
	public void login()
	{
		System.out.println("providing method body/logic/implementation");
	}
}
class AB1
{
	public static void main(String[] args) 
	{
		Amaz ref = new Amazon();
		ref.login();
	}
}
