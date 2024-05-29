package string;

import java.util.Scanner;

public class StringCountMiss 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			int c=s.charAt(i);
			if(!(c>='a' && c<='z') && !(c>='A' && c<='Z') && !(c>='0' && c<='9') && (c!=' '))
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
