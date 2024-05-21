package sort;
//You are given an array a comprising of n integers. 
//You have to calculate the magic value of array a.
//Magic value of an array is equal to difference between 
//sum of good integers in an array and sum of bad integers in a array
//good integers are numbers whose indexes are not changed once sorted. Rest all are bad.
import java.util.Scanner;

public class SortMagicValue {
	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]= {0,4,0,0,1,3,4,1,0,2};
		int b[]=a.clone();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int good=0, bad=0;
		for (int i = 0; i < b.length; i++) {
			if(a[i]==b[i])
			{
				good=good+a[i];
			}
			else
			{
				bad=bad+a[i];
			}
		}
		System.out.println(good-bad);
		
	}

}
