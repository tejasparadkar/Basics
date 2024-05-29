package string;
//WAJP to convert lowercase character to uppercase
public class StringUppercase {

	public static void main(String[] args) {
		String s = "Pineapple1231...";
		char[] ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
		String output = new String(ch);
		System.out.println(output);
	}

}
