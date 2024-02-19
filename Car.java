class Car //storing and printing multiple objects of same class in different variables
{
	public static void main(String[] args) 
	{
		Car ref1 = new Car();
		Car ref2 = new Car();
		Car ref3 = new Car();
		System.out.println("Car1: "+ref1);
		System.out.println("Car2: "+ref2);
		System.out.println("Car3: "+ref3);
	}
}
