interface Car
{
	void run();
	void brake();
	void nitro();
	void skid();
}
class Bmw implements Car
{
	public void run()
	{
		System.out.println("Car runs fast");
	}
	public void brake()
	{
		System.out.println("Car brakes late");
	}
	public void nitro()
	{
		System.out.println("Nitro can be launched");
	}
	public void skid()
	{
		System.out.println("Car cannot skid because of ABS");
	}
}
class  AB4
{
	public static void main(String[] args) 
	{
		Car ref1 = new Bmw();
		ref1.run();
		ref1.brake();
		ref1.nitro();
		ref1.skid();
	}
}
