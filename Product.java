package object_class;

import java.util.Scanner;

class Product1
{
	int pNo;
	String pName;
	double pPrice;
	int pQuantity;
	public Product1(int pNo, String pName, double pPrice, int pQuantity) 
	{
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
	}
	@Override
	public String toString()
	{
		System.out.println(super.toString());
		System.out.println("Product No: "+pNo);
		System.out.println("Product Name: "+pName);
		System.out.println("Product Price: "+pPrice);
		System.out.println("Product Quantity: "+pQuantity);
		return" ";
	}
	
	@Override
	public int hashCode()
	{
		return pNo;
	}
	
}

public class Product 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id: ");
		int a1=s.nextInt();
		System.out.println("Enter name: ");
		s.nextLine();
		String b1=s.nextLine();
		System.out.println("Enter price: ");
		double c1=s.nextDouble();		
		System.out.println("Enter Quantity: ");
		int d1=s.nextInt();		
		Product1 p1 = new Product1(a1,b1,c1,d1);
		System.out.println(p1);
		
		
		System.out.println("Enter id: ");
		int a2=s.nextInt();
		System.out.println("Enter name: ");
		s.nextLine();
		String b2=s.nextLine();
		System.out.println("Enter price: ");
		double c2=s.nextDouble();		
		System.out.println("Enter Quantity: ");
		int d2=s.nextInt();	
		Product1 p2 = new Product1(a2,b2,c2,d2);
		System.out.println(p2);
		
		
		System.out.println("Enter id: ");
		int a3=s.nextInt();
		System.out.println("Enter name: ");
		s.nextLine();
		String b3=s.nextLine();
		System.out.println("Enter price: ");
		double c3=s.nextDouble();		
		System.out.println("Enter Quantity: ");
		int d3=s.nextInt();	
		Product1 p3 = new Product1(a3,b3,c3,d3);
		System.out.println(p3);
		
		System.out.println(p1.pName.equals(p3.pName));
	}

}
