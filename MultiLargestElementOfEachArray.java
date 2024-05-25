package arraymultidimension;
//WAJP to find the largest element from each array of element
public class MultiLargestElementOfEachArray 
{

	public static void main(String[] args) 
	{
		int[][] a = {{137,53,58,78},{90,26,49,96},{62,63,85,97,911}};
		for (int i = 0; i < a.length; i++) 
		{
			int largest=a[i][0];//0 indicates first element of i array
			for (int j = 0; j < a[i].length; j++) 
			{				
				if(a[i][j]>largest)
				{
					largest=a[i][j];
				}				
			}
			System.out.println(largest);
		}
	}

}
