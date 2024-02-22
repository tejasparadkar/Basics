class  Nsfs//printing static members from non static
{
	static int i=10;
	public void test()
	{
		int i=25;
		System.out.println("Directly: "+i);
		System.out.println("Class name: "+Nsfs.i);
		System.out.println("this: "+this.i);
	}
	public static void main(String[] args) 
	{
		Nsfs ref = new Nsfs();
		ref.test();
	}
}
