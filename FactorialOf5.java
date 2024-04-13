package programming;
//WAJP to find factorial of 5
public class FactorialOf5 {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		n=5;
		fact=1;
		int i=n;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
			
	}

}
