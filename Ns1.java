class Ns1//executing non staic from static  
{
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition is: "+c);
	}
	public static void main(String[] args) 
	{
		Ns1 ref = new Ns1();
		ref.add(10,20);
	}
}
