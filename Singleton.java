package concepts;

class A
{
	private static A ref = new A();
	private A()
	{
		System.out.println("I am a constructor");
	}
	public static A getA()
	{
		return ref;
	}
}

public class Singleton {

	public static void main(String[] args) {
		A ref1  = A.getA();
		A ref2  = A.getA();
		System.out.println(ref1);
		System.out.println(ref2);
	}

}
