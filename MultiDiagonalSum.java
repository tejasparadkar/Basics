package arraymultidimension;
//WAJP  to print sum of diagonal elements by removing common diagonal element one's
public class MultiDiagonalSum 
{
	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if (i==j) 
				{
					sum=sum+a[i][j];
				} 
				else if(i+j==a.length-1)
//if we want to add common diagonal then remove else and keep only if condition
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
