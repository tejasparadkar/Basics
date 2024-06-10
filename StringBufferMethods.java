package stringBuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Python");
		System.out.println(sb);
		sb.append("Language");
		System.out.println(sb);
		sb.insert(6, " Programming Language");
		System.out.println(sb);
		sb.delete(19, 28);
		System.out.println(sb);
		sb.replace(0, 6, "java");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
