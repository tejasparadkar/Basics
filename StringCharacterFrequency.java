package string;

import java.util.LinkedHashMap;

//WAJP to count the frequency of each character in string
public class StringCharacterFrequency {

	public static void main(String[] args) {
		String s="Maharashtra";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				map.put(ch,count+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);

	}

}
