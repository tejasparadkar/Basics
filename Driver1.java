class Fruit//superclass
{
	int i = 10;
}
class Mango extends Fruit//subclass
{
	int j = 20;
}
class Driver1//upcasting and downcasting
{
	public static void main(String[] args) 
	{
		Fruit ref = new Mango();
		System.out.println("i: "+ref.i);
		//System.out.println("j: "+ref.j);//CTE
		Mango ref1 = (Mango) ref;
		System.out.println("j: "+ref1.j);
	}
}
