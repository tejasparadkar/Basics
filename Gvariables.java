class Gvariables//print both static and nonstatic context  
{
	static String name="Bankname";
	static double pi = 3.14;
	char a = 'T';
	int num = 12345;
	public void nonstaticmethod()
	{
		String name="User name";
		char a = 'P';
		System.out.println("Accessing Static and non static variable from non static method:");
		System.out.println("Local name: "+name);
		System.out.println("Global name: "+this.name);//static from non static
		System.out.println("Local char: "+a);
		System.out.println("Global char: "+this.a);//non static from non static
	}
	public static void staticmethod()
	{
		double pi = 22/7;
		int num=3456767;
		System.out.println("Accessing Static and non static variables from static method:");
		System.out.println("Local pi: "+pi);
		System.out.println("Class pi: "+Gvariables.pi);//static from static
		System.out.println("Local num: "+num);
		Gvariables ref1 = new Gvariables();
		System.out.println("Class num: "+ref1.num);//non static from static
	}
	public static void main(String[] args) 
	{
		String name="Main";
		int num = 988756;
		Gvariables ref = new Gvariables();
		System.out.println("Accessing Static and non static variables from main method:");
		System.out.println("Local name: "+name);
		System.out.println("Class name: "+Gvariables.name);//static from static
		System.out.println("Local num: "+num);
		System.out.println("Class num: "+ref.num);//non static from static
		ref.nonstaticmethod();
		staticmethod();
	}
}
