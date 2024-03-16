interface UPI
{
	void payments();
}
class Gpay implements UPI
{
	public void payments()
	{
		System.out.println("Payment done by Gpay.");
	}
}
class PhonePe implements UPI
{
	public void payments()
	{
		System.out.println("Payment done by PhonePe.");
	}
}
class AB6 
{
	public static void main(String[] args) 
	{
		UPI ref1=new Gpay();
		ref1.payments();
		UPI ref2=new PhonePe();
		ref2.payments();
	}
}
