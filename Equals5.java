package object_class;
class ABC
{
	@Override 
	public int hashCode()
	{
		return 10;
	}
}
public class Equals5 {
public static void main(String[] args) {
	ABC ref = new ABC();
	System.out.println(ref);
	System.out.println(ref.hashCode());
}
}
