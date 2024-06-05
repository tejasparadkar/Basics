package string;

import java.util.HashMap;
import java.util.Map;

//WAJP to convert Roman number to int
public class StringRomanToInt {

	public static void main(String[] args) {
		String s= "LIV";
		s = s.replace("IV","IIII");
		s = s.replace("IX","VIIII");
		s = s.replace("XL","XXXX");
		s = s.replace("XC","LXXXX");
		s = s.replace("CD","CCCC");
		s = s.replace("CM","DCCCC");
		Map<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			sum=sum+roman.get(s.charAt(i));
		}
		System.out.println(sum);

	}

}
