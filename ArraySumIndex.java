package array;
//Given an array of integers nums and an integer target, return indices of the two numbers 
//such that they add up to target 
//One may assume that each input would have exactly one solution, and you may not use the 
//same element twice
//input nums=[2,7,11,15],target=9
//output = [0,1]
//input nums=[3,2,4],target=6
//output = [1,2]

import java.util.Scanner;

public class ArraySumIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = s.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++)
		{
			System.out.println("Enter value: ");
			nums[i]=s.nextInt();
		}
		System.out.println("Enter the target");
		int target= s.nextInt();
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					if(i!=j && i<j)
					{
						System.out.println(i+","+j);
						break;
					}
				}
			}
		}

	}

}
