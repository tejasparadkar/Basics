package array;
//Reverse the array
public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Original Order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reverse Order");
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[a.length-i-1]= a[i];
			//System.out.println(a[i]);
		}
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
	}

}
