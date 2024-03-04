import java.util.Scanner;
class Employee
{
	private int employeeId;
	private double employeeSalary;
	String name;
	double yearExperience;
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeSalary(double employeeSalary)
	{
		this.employeeSalary = employeeSalary;
	}
	public double getEmployeeSalary()
	{
		return employeeSalary;
	}
	public void get()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("Enter Employee Details" );
		System.out.println("Enter Id: ");
		setEmployeeId(s1.nextInt());
		System.out.println("Enter name: ");
		s1.nextLine();
		name=s1.nextLine();
		System.out.println("Enter Salary: ");
		setEmployeeSalary(s1.nextDouble());
		System.out.println("Enter Years of Experience: ");
		yearExperience = s1.nextDouble();
	}
}
class Company
{

	public static void print(int i,String n,double s,double y)
	{
		System.out.println("=================");
		System.out.println("Details are" );
		System.out.println("Employee Id : "+i);
		System.out.println("Employee Name: "+n);
		System.out.println("Employee Salary : "+s);
		System.out.println("Employee year of experience : "+y);
		
	}
	public static void main(String[] args) 
	{
		Employee p1 = new Employee();
		p1.get();
		Employee p2 = new Employee();
		p2.get();
		
		Employee p3 = new Employee();
		p3.get();
		
		print(p1.getEmployeeId(),p1.name,p1.getEmployeeSalary(),p1.yearExperience);
		print(p2.getEmployeeId(),p2.name,p2.getEmployeeSalary(),p2.yearExperience);
		double a = p2.getEmployeeSalary();
		double i = (a*25)/100;
		p2.setEmployeeSalary(a+i);
		System.out.println("Incremented Salary : "+p2.getEmployeeSalary());		
		print(p3.getEmployeeId(),p3.name,p3.getEmployeeSalary(),p3.yearExperience);
		double c = p3.getEmployeeSalary();
		double d = (c*4.5)/100;
		p3.setEmployeeSalary(c-d);
		System.out.println("Decremented Salary : "+p3.getEmployeeSalary());
	}
}
