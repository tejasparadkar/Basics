class Ins//non static from static 
{
	String un;
	public static void main(String[] args) 
	{
		Ins ref1=new Ins();
		ref1.un="Sheela";
		Ins ref2=new Ins();
		ref2.un="Shakila";
		System.out.println("Username 1: "+ref1.un);
		System.out.println("Username 2: "+ref2.un);
	}
}
