package array;
//WAJP to find if average of unsorted array matches the elements in array.
//If so print the number of times it matches
//Input:(2,2,2,2,2)
//output:5
import java.util.Scanner;

public class ArrayAverageEqualElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int a = s.nextInt();
		int n[] = new int[a];
		for(int i=0;i<n.length;i++)
		{
			System.out.println("Enter value: ");
			n[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		int average=(sum/n.length);
		int count=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==average)
			{
				count++;
			}			
		}
		System.out.println("Average is: "+average);
		System.out.println("It contains "+count+" elements");

	}

}
