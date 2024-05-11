package array;
//WAJP to print all odd elements from array
public class ArrayPrintOddElements {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,5,5,6,6,7,8,9,7,6,5,3,4,2,2,3,4,3,2,3,2};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
