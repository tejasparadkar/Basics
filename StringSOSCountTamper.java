package string;
//WAJP to count the number of characters tampered in the SOS message
public class StringSOSCountTamper {

	public static void main(String[] args) {
		String s="SOSTOT";
		String original="";
		int n = s.length()/3;
		for (int i = 0; i <= n; i++) {
			original = original +"SOS";
		}
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(original.charAt(i)!=s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
