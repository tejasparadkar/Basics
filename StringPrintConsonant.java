package string;
//WAJP to print consonants
public class StringPrintConsonant {

	public static void main(String[] args) {
		String s="pineapple";
		System.out.println(s);
		String c="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch!='a'&& ch!='e' && ch!='i'&& ch!='o'&& ch!='u')
			{
				c=c+ch;
			}
		}
		System.out.println("Consonants: "+c);


	}

}
