package Collections;
import java.util.ArrayList;
public class Collection7 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		//to add all objects
		for(char ch ='a';ch<='z';ch++)
		{
			a.add(ch);
		}
		System.out.println("List of Objects"+a);		
		//to access all objects
		for(int i=a.size()-1;i>=0;i--)
		{
			System.out.println(a.get(i));
		}
	}
}


