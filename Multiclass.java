//creating multiple classes in java
class  Monkey
{
	static int i= 10;
	int j= 20;
}
class Multiclass
{
	public static void main(String[] args) 
	{
		Monkey ref = new Monkey();
		System.out.println("Static: "+Monkey.i);
		System.out.println("Non- Static: "+ref.j);
	}
}
