package sort;
//Bubble  sort where we select one index and 
//compare with immediate next index
//this process should be repeated for all elements
//for 6 examples there will be 6 iterations
public class SortBubbleSort {
	public static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int a[] = {14,3,8,28,26,2};
		System.out.println("Before sort");
		printArray(a);
		System.out.println("Ascending order: ");
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
		printArray(a);
		System.out.println("Descending order: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		printArray(a);

	}

}
