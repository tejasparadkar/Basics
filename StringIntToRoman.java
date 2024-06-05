package string;

import java.util.HashMap;
import java.util.Map;

//WAJP to convert Int to Roman
public class StringIntToRoman {

	public static void main(String[] args) {
		int n = 4949;
		Map<Integer, Character> roman = new HashMap<Integer, Character>();
		roman.put(1, 'I');
		roman.put(5, 'V');
		roman.put(10,'X');
		roman.put(50,'L');
		roman.put(100,'C');
		roman.put(500,'D');
		roman.put(1000,'M');
		String s="";
		while(n!=0)
		{
			if(n>=1000)
			{
				s=s+"M";
				n=n-1000;
			}
			else if(n>=500 && n<1000)
			{
				s=s+"D";
				n=n-500;
			}
			else if(n>=100 && n<500)
			{
				s=s+"C";
				n=n-100;
			}
			else if(n>=50 && n<100)
			{
				s=s+"L";
				n=n-50;
			}
			else if(n>=10 && n<50)
			{
				s=s+"X";
				n=n-10;
			}
			else
			{
				s=s+"I";
				n=n-1;
			}
		}
		s = s.replace("IIII","IV");
		s = s.replace("VIIII","IX");
		s = s.replace("XXXX","XL");
		s = s.replace("LXXXX","XC");
		s = s.replace("CCCC","CD");
		s = s.replace("DCCCC","CM");
		System.out.println(s);
		
	}

}
