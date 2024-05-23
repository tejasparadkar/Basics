package sort;
//WAJP to perform insertion sort
public class SortInsertionSort 
{
	public static void printArray(int a[])
	{
		for (int i= 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int a[]= {9,3,1,14,5};
		System.out.println("Before Sorting");
		printArray(a);
		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		System.out.println("Ascending order:");
		printArray(a);
		for (int i = 0; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]<temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		System.out.println("Descending order: ");
		printArray(a);

	}

}
