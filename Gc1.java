package garbageCollection;

public class Gc1 {

	public static void main(String[] args) 
	{
		System.out.println(new Gc1());//creating anonymous object
		Gc1 ref = new Gc1();
		ref=null;//nullifying object reference
		Gc1 ref1 = new Gc1();
		Gc1 ref2 = new Gc1();
		ref1=ref2;//assigning reference of one object to another
		System.gc();
	}
	public void finalize()
	{
		System.out.println("Clean up activity");
	}
}
