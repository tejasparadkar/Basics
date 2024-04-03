package exception;
//try-catch
public class E7 {
	
	public static void get()
	{
		System.out.println("Hi, how are you");
		try
		{
			get();
		}
		catch (StackOverflowError e) {
			System.out.println("Method recurssion");
		}
		
	}
	
	public static void main(String[] args) {
		get();
	}

}
