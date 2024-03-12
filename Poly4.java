class P1
{
	public void sheela()
	{
		System.out.println("Super class");
	}
}
class P2 extends P1
{
	public void sheela()
	{
		System.out.println("Sub class");
	}
}
class Poly4
{
	public static void main(String[] args) 
	{
		P1 ref1=new P1();
		ref1.sheela();
		P2 ref2=new P2();
		ref2.sheela();
		P1 ref3=new P2();
		ref3.sheela();
	}
}
