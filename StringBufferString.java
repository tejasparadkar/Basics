package stringBuffer;

public class StringBufferString {

	public static void main(String[] args) {
		String s1 = "Qspiders";
		System.out.println(s1);
		s1.concat("Thane");//immutable(will not be modified unless stored in variable)
		System.out.println(s1);
		s1=s1.concat("Thane");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Jspiders");
		System.out.println(s2);
		s2.append("Thane");//mutable
		System.out.println(s2);

	}

}
