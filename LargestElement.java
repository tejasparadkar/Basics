package array;
//Largest element in array
import java.util.Arrays;

public class LargestElement {
	public static int sort(int arr[])
	{
		Arrays.sort(arr);
		int a = arr.length-1;
		return arr[a];
	}
	public static void main(String[] args) {
		int arr1[]= {2,4,5,1,12,3};
		System.out.println("Largest Element in array is: "+sort(arr1));

	}

}
