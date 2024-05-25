package arraymultidimension;

public class MultiTypesArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		System.out.println(a);//address of 2d array
		System.out.println(a[0]);//address of first 1d array
		System.out.println(a[0][1]);//second element present in first 1d array
		System.out.println();
		for (int i = 0; i < a.length; i++)//outer array
		{
			for (int j = 0; j < a[i].length; j++) //inner array will iterate till length of 1d array
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
