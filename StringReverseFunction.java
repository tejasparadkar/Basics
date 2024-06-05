package string;
//WAJP to store and print the reverse String
public class StringReverseFunction {
	public static String revString(String s)
	{
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String s="My name is Tejas";
		System.out.println(s);
		String[] a=s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(revString(a[i])+"");
		}
	}

}
