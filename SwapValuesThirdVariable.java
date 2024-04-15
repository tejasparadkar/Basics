package programming;
//WAJP to swap numbers using third variable
public class SwapValuesThirdVariable {

	public static void main(String[] args) {
		int a =10;
		int b =50;
		System.out.println("Before Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}

}
