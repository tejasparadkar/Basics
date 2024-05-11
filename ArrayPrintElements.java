package array;
//WAJP to print all elements in array
public class ArrayPrintElements {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		//using for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("===========");
		//using foreach loop
		for(int i : a)
		{
			System.out.println(i);
		}
		System.out.println("===========");
		//using do while loop
		int i=0;
		do {
			System.out.println(a[i]);
			i++;
		} while (i<a.length);
		System.out.println("===========");
		//using while loop
		int j=0;
		while (j<a.length)
		{
			System.out.println(a[j]);
			j++;
		} 
		System.out.println("Array size is: "+a.length);
	}

}
