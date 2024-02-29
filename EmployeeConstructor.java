class EmployeeConstructor 
{
	int emp_id;
	String emp_name;
	double emp_salary;
	EmployeeConstructor()
	{
		
	}
	EmployeeConstructor(int emp_id)
	{
		this.emp_id = emp_id;
		
	}
	EmployeeConstructor(int emp_id, String emp_name)
	{
		this.emp_id = emp_id;
		
		this.emp_name = emp_name;
		
	}
	EmployeeConstructor(int emp_id, String emp_name, double emp_salary)
	{
		this.emp_id = emp_id;
		
		this.emp_name = emp_name;
		
		this.emp_salary = emp_salary;
		
	}
	public void emp_details()
	{
		System.out.println("No argument Constructor.");
		System.out.println("Employee ID:  "+emp_id);
		System.out.println("Employee Name:  "+emp_name);
		System.out.println("Employee Salary:  "+emp_salary);
		System.out.println("=======================");	
	}

	public static void main(String[] args) 
	{
		EmployeeConstructor ref1 = new EmployeeConstructor();
		ref1.emp_details();
		EmployeeConstructor ref2 = new EmployeeConstructor(12);
		ref2.emp_details();
		EmployeeConstructor ref3 = new EmployeeConstructor(13,"XYZ");
		ref3.emp_details();
		EmployeeConstructor ref4 = new EmployeeConstructor(13,"XYZ",234543);
		ref4.emp_details();
		
	}
}
