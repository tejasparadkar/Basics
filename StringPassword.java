package string;
//WAJP to check the strength of the password
public class StringPassword {

	public static void main(String[] args) {
		String s = "Hello@123";
		if(s.length()>=8)
		{
			boolean upper=false, lower=false, digit=false, special=false;
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					upper=true;
				}
				else if (ch>='a' && ch<='z') 
				{
					lower=true;
				}
				else if (ch>='0' && ch<='9')
				{
					digit=true;
				}
				else
				{
					special=true;
				}
			}
			if(upper && lower && digit && special)
			{
				System.out.println("Strong Password");
			}
			else 
			{
				System.out.println("Not a strong password");
			}
		}
	}

}
