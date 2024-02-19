class Nsv//printing non static variable from static context 
{
	int a=10;
	public static void main(String[] args) 
	{
		Nsv ref=new Nsv();
		System.out.println("Object Reference:"+ref.a);
	}
}
