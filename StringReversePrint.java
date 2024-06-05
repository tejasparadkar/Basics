package string;
//WAJP to reverse the sentence and print
//Input: My name is Tejas
//Output: Tejas is name my
public class StringReversePrint {

	public static void main(String[] args) {
		String s="My name is Tejas";
		String[] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
