package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ipl {

	public static void main(String[] args) {
		ArrayList mi=new ArrayList();
		ArrayList csk = new ArrayList();
		
		Scanner s = new Scanner(System.in);
		System.out.println("**********************************");
		for(int i=1; i<=11; i++)
		{
			
			System.out.println("Enter player for Mumbai Indians: ");
			String mip = s.nextLine();
			mi.add(mip);
			
		}
		System.out.println("**********************************");
		for(int j=1; j<=11; j++)
		{
			
			System.out.println("Enter player for Chennai Super Kings: ");
			String cskp = s.nextLine();
			csk.add(cskp);
			System.out.println("**********************************");
		}
		
		System.out.println("Mumbai Indians Team: "+mi);
		System.out.println("Chennai Super Kings Team: "+csk);
		
		if(csk.contains("MS Dhoni"))
		{
			System.out.println("Thala is back again.");
		}
		else
		{
			System.out.println("Oh sad news, Dhoni not playing");
		}
		
		if(mi.contains("Hardik Pandya"))
		{
			System.out.println("Management Decision is not appropriate");
		}
		else
		{
			System.out.println("Wow amazing good to hear for MI fans");
		}
		
		mi.remove("Hardik Pandya");
		System.out.println("Rohit is back...");
		
		csk.addAll(mi);
		System.out.println(csk);
		
		System.out.println("****Forward Order****");
		for(Object obj:csk)
		{
			System.out.println(obj);
		}
		System.out.println("****Reverse Order****");
		for(int i=csk.size()-1;i>=0;i--)
		{
			System.out.println(csk.get(i));
		}
		
	}

}
