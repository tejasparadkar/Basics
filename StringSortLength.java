package string;

public class StringSortLength {

	public static void main(String[] args) {
		String[] a = {"watermelon","apple","kiwi","banana"};
		String small=a[0];
		for (int i = 0; i < a.length; i++) {
				if(a[i].length()<small.length())
				{
					small=a[i];
				}
		}
		System.out.println(small);
	}

}
