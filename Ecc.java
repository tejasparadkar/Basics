class Ecc //constructor chaining 
{
	int id;
	String name;
	double salary;
	Ecc()
	{
		System.out.println("No argument constructor");
	}
	Ecc(int id)
	{
		this.id=id();
		System.out.println("1 Parameterized constructor");
	}
	Ecc(int id,String name)
	{
		this.id=id();
		this.name=name();
		System.out.println("2 Parameterized constructor");
	}
	Ecc(int id,String name, double salary)
	{
		this.id=id();
		this.name=name();
		this.salary=salary();
		System.out.println("3 Parameterized constructor");
	}
	public void emp_details()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) 
	{
		Ecc e1 = new Ecc(123,"XYZ",98765);
		e1.emp_details();
		
	}
}
