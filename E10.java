package exception;

class MachhaGrowUpException extends RuntimeException
{
	
}
class Voting
{
	int age;

	Voting(int age)
	{
		if(age>=18)
		{
			this.age = age;
			System.out.println("You're eligible");
		}
		else
		{
			throw new MachhaGrowUpException();
		}
	}
		
}
public class E10 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Voting v = new Voting(17);
		System.out.println("Program ends");
	}

}
