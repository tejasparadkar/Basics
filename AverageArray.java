package array;
//calculating average of array elements
public class AverageArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11};
		
		int sum=0;
		for(int i = 0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		int average=sum/(a.length);
		System.out.println("Average of elements is: "+average);
	}

}
