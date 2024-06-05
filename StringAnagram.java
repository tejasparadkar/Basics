package string;

import java.util.Arrays;

//WAJP to check whether given 2 strings are anagram or not
//s1 is equal to s2 chars not
public class StringAnagram {

	public static void main(String[] args) {
		String s1="cat";
		String s2="atc";
		if (s1.length()==s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean isAnagram=true;
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i]!=ch2[i]) {
					isAnagram=false;
					break;
				}
			}
			if (isAnagram) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an Anagram");
			}
			
		}
		else {
			System.out.println("Not an anagram");
		}

	}

}
