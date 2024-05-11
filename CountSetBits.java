package programming;

import java.util.Scanner;

//WAJP to write function that takes binary as input and prints number of set bits
//(count number of 1s in binary format)
public class CountSetBits {
	public static void countSetBit(int n)
	{
		int count=0;
		while(n!=0)
		{
			int r=(n%2);
			if(r==1)
			{
				count++;
			}
			n=n/2;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		//in built methods
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.bitCount(n));
		countSetBit(n);

	}

}
