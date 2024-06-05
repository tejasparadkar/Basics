package string;
//WAJP to swap string without using third variable
public class StringSwapWithoutThirdVariable {

	public static void main(String[] args) {
		String s1= "Hello";
		String s2= "Tejas";
		System.out.println("Before Swapping");
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		s1=s1.concat(s2);
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After Swapping");
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);

	}

}
