package programming;
//WAJP to find sum of all odd numbers in range 1-10
public class SumOfOddNumbers {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers from 1-10: "+sum);
		int i=1;
		sum=0;
		while(i<=10)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum of odd numbers from 1-10: "+sum);
		

	}

}
