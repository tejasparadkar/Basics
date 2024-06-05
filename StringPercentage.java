package string;
//WAJP to count percentage of Upper case,Lower case,numbers and special characters in string
public class StringPercentage {

	public static void main(String[] args) {
		String s = "Hello123@123";
		float upper=0;
		float lower=0;
		float number=0;
		float special=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='a' && ch<='z') {
				lower++;
			}
			else if(ch>='A' && ch<='Z') {
				upper++;
			}
			else if (ch>='0' && ch<='9') {
				number++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Lower percentage: "+(lower/s.length())*100);
		System.out.println("Upper percentage: "+(upper/s.length())*100);
		System.out.println("Number percentage: "+(number/s.length())*100);
		System.out.println("Special percentage: "+(special/s.length())*100);
		
	}

}
