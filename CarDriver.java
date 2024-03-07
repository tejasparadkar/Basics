import java.util.Scanner;
class Vehicle 
{
	int vNumber;
	String vBrand;
	long vPrice;
	public static void vehicleDetails()
	{
		System.out.println("=======================");
		System.out.println("Vehicle Number: "+vNumber);
		System.out.println("Vehicle Brand: "+vBrand);
		System.out.println("Vehicle Price: "+vPrice);
	}
}
class Car extends Vehicle
{
	Car(int vNumber, String vBrand, long vPrice)
	{
		this.vNumber=vNumber;
		this.vBrand=vBrand;
		this.vPrice=vPrice;
	}
}
class CarDriver
{
	static int n;
	static String b;
	static long p;
	public static void getDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("Enter Vehicle Number: ");
		n=s.nextInt();
		System.out.println("Enter Vehicle Brand: ");
		s.nextLine();
		b=s.nextLine();
		System.out.println("Enter Vehicle Price: ");
		p=s.nextLong();
			
	}
	public static void main(String[] args) 
	{
		getDetails();
		Car c1=new Car(n,b,p);		
		c1.vehicleDetails();	
		getDetails();
		Car c2=new Car(n,b,p);		
		c2.vehicleDetails();		
		getDetails();
		Car c3=new Car(n,b,p);		
		c3.vehicleDetails();		
		getDetails();
		Car c4=new Car(n,b,p);		
		c4.vehicleDetails();	
		getDetails();
		Car c5=new Car(n,b,p);		
		c5.vehicleDetails();
		
	}
}
