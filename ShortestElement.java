package array;

import java.util.Arrays;

//smallest element in the array
public class ShortestElement {
	public static int sort(int arr[])
	{
		Arrays.sort(arr);
		return arr[0];
	}
	public static void main(String[] args) {
		int arr1[]= {2,5,3,1,0};
		System.out.println("Smallest element in array is: "+sort(arr1));

	}

}
