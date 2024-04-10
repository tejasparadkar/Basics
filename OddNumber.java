package programming;

public class OddNumber {

	public static void main(String[] args) {
		for(int i =1; i<11; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number is "+i);
			}
		}
		int i=1;
		do			
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i<11);

	}

}


