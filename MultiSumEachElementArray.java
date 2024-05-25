package arraymultidimension;
//WAJP to perform sum of each array in multidimensional array
public class MultiSumEachElementArray 
{
	public static void main(String[] args) 
	{
		int a[][]={{137,53,58,78},{90,26,49,96},{62,63,85,97,911}};
		for (int i = 0; i < a.length; i++) 
		{
			int sum=0;
			for (int j = 0; j < a[i].length; j++) 
			{
				sum=a[i][j]+sum;
			}
			System.out.println(sum);
		}

	}

}
