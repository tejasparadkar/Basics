package object_class;
import java.util.Scanner;
class Customer1 
{
	int cId;
	String cName;
	String cAddress;
	long cMob;
	Customer1(int cId,String cName,String cAddress,long cMob)
	{
		this.cId=cId;
		this.cName=cName;
		this.cAddress=cAddress;
		this.cMob=cMob;
	}
	@Override
	public String toString()
	{
		System.out.println("*************");
		System.out.println("Customer ID: "+cId);
		System.out.println("Customer Name: "+cName);
		System.out.println("Customer Address: "+cAddress);
		System.out.println("Customer Mobile: "+cMob);
		return "";
		
	}
}
class Customer
{
	static int cId;
	static String cName;
	static String cAddress;
	static long cMob;
	public static void form()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("*************");
		System.out.println("Enter ID:");
		cId = s.nextInt();
		s.nextLine();
		System.out.println("Enter Name:");
		cName = s.nextLine();
		System.out.println("Enter Address:");
		cAddress = s.nextLine();
		System.out.println("Enter Mobile Number:");
		cMob = s.nextLong();
	}
	public static void main(String[] args) 
	{
		form();
		Customer1 c1=new Customer1(cId,cName, cAddress, cMob);
		System.out.println(c1);
		form();
		Customer1 c2=new Customer1(cId,cName, cAddress, cMob);
		System.out.println(c2);
		form();
		Customer1 c3=new Customer1(cId,cName, cAddress, cMob);
		System.out.println(c3);
		form();
		Customer1 c4=new Customer1(cId,cName, cAddress, cMob);
		System.out.println(c4);
		form();
		Customer1 c5=new Customer1(cId,cName, cAddress, cMob);
		System.out.println(c5);
	}

}
