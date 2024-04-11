package programming;
//WAJP to print sum of 1 to 10
public class SumofNumbers {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<11;i++)
		{
			sum=i+sum;
		}
		System.out.println(sum);
		sum=0;
		int i=1;
		do 
		{
			sum=sum+i;
			i++;
		}
		while(i<11);
		System.out.println(sum);
		i=1;
		sum=0;
		while(i<11)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
