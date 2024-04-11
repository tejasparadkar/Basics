package programming;
//WAJP to print table of 5 
public class TableOf5 {

	public static void main(String[] args) {
		int n=5;
		System.out.println("Table of 5 is as follows:");
		for(int i=1;i<=10;i++)
		{
			int product=n*i;
			System.out.println(n+"x"+i+"="+product);
		}
	}
}
