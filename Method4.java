class Method4//multiplication and subtration using no argument method
{
	public static void multiply()//method called
	{
		int a=10;
		int b=20;
		int c=30;
		int mul=a*b*c;
		System.out.print("Multiplication is: ");
		System.out.println(mul);
	}
	public static void subtract()
	{
		int n1=500;
		int n2=400;
		int n3=300;
		int n4=200;
		int n5=100;
		int sub=n1-n2-n3-n4-n5;
		System.out.print("Subtraction is: ");
		System.out.println(sub);
	}
	public static void main(String[] args) //calling method
	{
		multiply();//method calling statement 
		subtract();
	}
}
