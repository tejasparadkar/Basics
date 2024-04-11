package programming;
//WAJP to print table from m to n
import java.util.Scanner;

public class TableOfMToN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int m=s.nextInt();
		System.out.println("Enter ending number: ");
		int n=s.nextInt();
		for(int i=m;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("*************************");
		}
	}

}
