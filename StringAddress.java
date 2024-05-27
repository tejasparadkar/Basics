package string;
//WAJP to write string program to compare address of two string in different methods.
public class StringAddress {

	public static void main(String[] args) {
		String s1="burger";
		String s2="burger";
		System.out.println(s1==s2);
		String s3=new String("Pizza");
		String s4=new String("Pizza");
		System.out.println(s3==s4);
	}

}
