package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//WAJP to count the unique element and print the index of that element and index should start with 1
public class StringUniqueELements {

	public static void main(String[] args) {
		String s="statistics";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		int index=0;
		for(Entry<Character, Integer> e:map.entrySet())
		{
			index++;
			if(e.getValue()==1)
			{
				break;
			}
		}
		if(index<= map.size())
		{
			System.out.println(index);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
