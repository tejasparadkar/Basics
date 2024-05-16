package array;
//WAJP to find average of elements in the array
//if you divide integer by integer then the result will also be in integer
//if you divide double by integer or integer by double or both in double
//then value will also be double
//Input: 14,12,0,3,5
//Output: 6.8(double)
//Output: 6(int)
public class ArrayAverage {

	public static void main(String[] args) {
		int[] a = {14,12,0,3,5};
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println(a.length);
		double average=(sum/a.length);
		System.out.println(average);
	}

}
