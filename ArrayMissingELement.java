package array;

import java.util.Scanner;

//Array contains n distinct numbers in range [0,n], return the only number in range that is missing
//Input: nums=[9,6,4,2,3,5,7,0,1]
//output: 8
//sum of natural numbers=(n*(n+1))/2
public class ArrayMissingELement {

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
		int totalSum=(a*(a+1))/2;
		
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		System.out.println("Missing value is: "+(totalSum-sum));

	}

}
