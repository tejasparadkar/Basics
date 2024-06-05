package string;
//WAJP to count number of hi without using loop
public class StringCountHi {
	public static int countHi(String s)
	{
		if(s.contains("hi"))
		{
			return 1 + countHi(s.substring(s.indexOf("hi")+2));
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		String s = "xxhixxhixxxxhixxhixhi";	
		System.out.println(countHi(s));
	}

}
