package array;

import java.util.Arrays;

//WAJP to enlist all the ways in which arrays can be duplicated
public class ArrayDuplicate {
	public static void printArray(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int a[]= {23,12,3,454,56,34,231,3456};
		printArray(a);
		
		int b[]=new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		printArray(b);
		
		int c[]=Arrays.copyOf(a, a.length);
		printArray(c);
		
		int d[] = new int[a.length];
		System.arraycopy(a, 0, d, 0, a.length);
		printArray(d);
		
		int e[]=a.clone();
		printArray(e);

	}

}
