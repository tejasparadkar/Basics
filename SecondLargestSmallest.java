package array;

import java.util.Arrays;

//second largest and smallest element in array
public class SecondLargestSmallest {
	public static int secondShortest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static int secondLargest(int arr[])
	{
		Arrays.sort(arr);
		int a=arr.length-2;
		return arr[a];
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Second shortest element is: "+secondShortest(a));
		System.out.println("Second largest element is: "+secondLargest(a));
	}
}
