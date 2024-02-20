class Ins1//static variable overwrites object 
{
	static String un;
	String u; 
	public static void main(String[] args) 
	{
		Ins1 ref1=new Ins1();
		ref1.u="hi";
		un="Sheela";
		
		System.out.println("Username 1: "+un);
		System.out.println("Username 1: "+ref1.u);
		System.out.println("Username 2: "+un);
	}
}
