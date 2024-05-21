package sort;
//WAJP to sort characters of your name in descending order
public class SortCharacter {
	public static void printArray(char a[])
	{
		for (int i= 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		char a[]= {'t','e','j','a','s'};
		System.out.println("Before sort:");
		printArray(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("After sort");
		printArray(a);

	}

}
