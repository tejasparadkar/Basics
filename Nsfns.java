class  Nsfns//printing non static members from non static
{
	int i=10;
	public void test()
	{
		int i=25;
		System.out.println("Directly: "+i);
		System.out.println("this: "+this.i);
	}
	public static void main(String[] args) 
	{
		Nsfns ref = new Nsfns();
		ref.test();
	}
}
