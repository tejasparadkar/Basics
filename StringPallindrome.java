package string;
//WAJP to check if String is palindrome
public class StringPallindrome {

	public static void main(String[] args) {
		String s = "levl";
		System.out.println(s);
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
