package programming;
//WAJP to print product of 1 to 5
public class ProductofNumbers {

	public static void main(String[] args) {
		int product=1;
		for(int i=1;i<6;i++)
		{
			product=i*product;
		}
		System.out.println(product);
	
		product=1;
		int i=1;
		while(i<6)
		{
			product=product*i;
			i++;
		}
		System.out.println(product);
		
		product=1;
		i=1;
		do
		{
			product=product*i;
			i++;
		}
		while(i<6);
		System.out.println(product);
		
	}

}

