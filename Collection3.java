package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList a = new ArrayList();
		for(int i=1;i<16;i++)
		{
			System.out.println("Enter object: ");
			String input = s.nextLine();
			a.add(input);
		}
		System.out.println(a);
		System.out.println("Size of list: "+a.size());

	}

}
