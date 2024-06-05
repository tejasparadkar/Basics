package string;
//WAJP to convert the first letter of each word in sentence to capital letter
public class StringCapitalizeFirst {
	public static void main(String[] args) {
		String s1 = "my Name is tejas";
		String a[] = s1.split(" ");
		String s2="";
		for (int i = 0; i < a.length; i++) {
			char c[] = a[i].toCharArray();
			for (int j = 0; j < c.length; j++) {
				if(c[0]>='a' && c[0]<'z')
				{
					c[0]=(char)(c[0]-32);
				}	
				s2 = s2 +c[j] ;
			}
		}
		System.out.println(s2);
	}

}
