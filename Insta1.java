class Insta1 // multiple non  static block, instance initializer block, anonymous block
{
	{
		System.out.println("IIB-1");
	}
	public static void main(String[] args) 
	{
		Insta1 ref1=new Insta1();
		Insta1 ref2=new Insta1();
		Insta1 ref3=new Insta1();
	}
	{
		System.out.println("IIB-2");
	}
}
