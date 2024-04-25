package array;
//count number of element repetition in array
public class RepeatArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2};
		boolean visited[] = new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					visited[j]=true;
					count++;
				}
				
			}
			System.out.println(a[i]+" : "+count);
		}

	}

}
