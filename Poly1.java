class P1
{
	int i=25;
}
class P2 extends P1
{
	int i=35;
}
class Poly1 
{
	public static void main(String[] args) 
	{
		P1 ref1=new P1();
		System.out.println("i: "+ref1.i);
		P2 ref2=new P2();
		System.out.println("i: "+ref2.i);
		P1 ref3=new P2();
		System.out.println("i: "+ref3.i);
	}
}
