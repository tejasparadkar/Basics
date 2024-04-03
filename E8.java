package exception;
//Exception Propagation
public class E8 {
	public static void sheela()
	{
		System.out.println("Hi");
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Main Begins");
		sheela();
		System.out.println("Main ends");
	}
}
