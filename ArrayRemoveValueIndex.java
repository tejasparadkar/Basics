package array;

import java.util.Scanner;

//WAJP to remove an element from the array at an given index
//Input- a=[zero,one,two,three,four,five]
//index=2
//Output-zero,one,three,four,five
public class ArrayRemoveValueIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = s.nextInt();
		String[] a = new String[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value: ");
			a[i]=s.next();
		}
		System.out.println("Enter the index to be removed");
		int r= s.nextInt();
		String[] na = new String[n-1];
		if(r<0 || r>=a.length)
		{
			System.out.println("Index does not exist");
		}
		else
		{
			for(int i=0;i<na.length;i++)
			{
				if(i<r)
				{
					na[i]=a[i];
				}
				else
				{
					na[i]=a[i+1];
				}
				a[i]=na[i];
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
			
	}

}
