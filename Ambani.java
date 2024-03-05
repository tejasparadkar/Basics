class Dhirubhai
{
	String company="Reliance";
	public void thinkingStyle()
	{
		System.out.println("Think big");
		System.out.println("Localization");
	}
}
class Mukesh extends Dhirubhai
{
}
class Ambani
{
	public static void main(String[] args) 
	{
		Mukesh d = new Mukesh();
		System.out.println("Company Name: "+d.company);
		System.out.println("Thinking Style: ");
		d.thinkingStyle();
	}
}
