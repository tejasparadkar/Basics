package array;
//Given an array of distinct elements.
//The task is to find triplets in array whose sum is zero.
public class ArrayDistinctElements {

	public static void main(String[] args) {
		int a[]= {0,-1,2,-3,1};
		for (int i=0; i < a.length-2; i++) 
		{
			for (int j=i+1; j < a.length-1; j++) 
			{
				for (int j2=j+1; j2 < a.length; j2++) 
				{
					int sum=a[i]+a[j]+a[j2];
					if(sum==0)
					{
						System.out.println("("+a[i]+" "+a[j]+" "+a[j2]+")");
					}
				}
			}
		}
	}

}
