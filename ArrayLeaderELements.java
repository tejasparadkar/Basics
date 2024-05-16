package array;
//WAJP to find leaders in array
//A leader is an element of the array which is greater than all the elements following it.
//The rightmost element in array is also leader
//for e.g. {8,7,4,3,5,2}
//leaders are 8,7,5,2
public class ArrayLeaderELements {

	public static void main(String[] args) {
		int a[] = {8,7,4,3,5,2};
		for(int i=0;i<a.length;i++)
		{
			boolean isLeader=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					isLeader=false;
					break;
				}
			}
			if(isLeader==true)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
