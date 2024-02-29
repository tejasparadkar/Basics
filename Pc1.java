class  Pc1 //parameterized constructor
{
	int i;
	Pc1(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) 
	{
		Pc1 ref=new Pc1(40);
		System.out.println(ref.i);
	}
}
