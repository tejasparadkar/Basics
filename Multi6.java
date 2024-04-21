package multithreading;
class A1
{
	synchronized public void demo1(B1 ref)
	{
		System.out.println("This is demo1 method");
		try {
			wait(5000);
		} catch (Exception e) {
			System.out.println("Handled");
		}
		ref.test1();
	}
	synchronized public void test2()
	{
		System.out.println("This is test 2 method");
	}
}
class B1
{
	synchronized public void demo2(A1 ref)
	{
		System.out.println("This is demo2 method");
		ref.test2();
	}
	synchronized public void test1()
	{
		System.out.println("This is test 1 method");
	}
}
public class Multi6 extends Thread{
	A1 a = new A1();
	B1 b = new B1();
	public void run()
	{
		a.demo1(b);
	}
	public void m1()
	{
		b.demo2(a);
	}
	public static void main(String[] args) {
		Multi6 ref = new Multi6();
		ref.start();
		ref.m1();
		
	}

}
