package string;

import java.util.Set;
import java.util.TreeSet;

//WAJP to check if the given string is Pangram or not
//Pangram is a string which contains all the 26 alphabets
public class StringPangram {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		s=s.toLowerCase();
		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch<='z') {
				set.add(ch);	
			}
		}
			if(set.size()==26)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}

		}

	}


