package string;
//WAJP to count all the vowels in string
public class StringCountVowels {

	public static void main(String[] args) {
		String s="Pineapple1231...";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("Vowels: "+count);

	}

}
