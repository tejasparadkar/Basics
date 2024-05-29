package string;
//WAJP to convert lowercase to uppercase and uppercase to lowercase
public class StringUpperLower {

	public static void main(String[] args) {
		String S="abcdE";
		char ch[]=S.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		String output= new String(ch);
		System.out.println(output);
	}

}
