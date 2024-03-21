package object_class;
class Mobile
{
	String brand;
	double price;
	Mobile(String brand, double price) 
	{
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public boolean equals(Object obj)
	{
		Mobile ref=(Mobile) obj;
		return this.brand==ref.brand && this.price==ref.price;
	}
	
	
}
public class Equals2 {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("iphone",65464654);
		Mobile m2 = new Mobile("iphone",65464654);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		
	}

}
