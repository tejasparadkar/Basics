abstract class Car
{
	abstract public void automation();
}
class Tata extends Car
{
	public void automation()
	{
		System.out.println("Engine automation drives car");
	}
}
abstract class Card
{
	abstract public void transaction();
}
class Visa extends Card
{
	public void transaction()
	{
		System.out.println("Transaction initiated for card");
	}
}
abstract class Network
{
	abstract public void range();
}
class Mobile extends Network
{
	public void range()
	{
		System.out.println("Mobile has range");
	}
}
class AB2
{
	public static void main(String[] args) 
	{
		Car ref1 = new Tata();
		ref1.automation();
		Card ref2 = new Visa();
		ref2.transaction();
		Network ref3 = new Mobile();
		ref3.range();
	}
}
