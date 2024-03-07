class P1 
{
	int i;
	int j;
	P1(int i)
	{
		this.i=i;
		System.out.println("P1 no-arg Constructor");
	}
	P1(int i, int j)
	{
		this(i);
		this.j=j;
		System.out.println("P1 2 FA constructor");
	}
}
class P2 extends P1
{
	P2(int i, int j)
	{
		super(i,j);
		System.out.println("P2 2 FA constructor");
	}
}
class AssignmentDriver1
{
	public static void main(String[] args) 
	{
		System.out.println("MB");
		P2 ref = new P2(25,35);
		System.out.println("i: "+ref.i);
		System.out.println("j: "+ref.j);
		System.out.println("ME");
	}
}
