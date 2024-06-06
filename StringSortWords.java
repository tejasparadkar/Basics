package string;
//WAJP to sort the given array of strings
public class StringSortWords {

	public static void main(String[] args) 
	{
		String[] a = {"coffee","watermelon","apple","orange","grape"};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if(a[j].compareTo(a[j+1]) > 0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("******************");
		String[] a1 = {"coffee","Watermelon","apple","orange","grape"};
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1.length-1; j++) 
			{
				if(a1[j].compareToIgnoreCase(a1[j+1]) > 0)
				{
					String temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}
	

}
