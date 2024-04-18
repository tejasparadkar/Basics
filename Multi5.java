package multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

class A
{
	String s = "Pineapple";
	String path="C:\\JSpiders\\Core Java\\Output.txt";
	public void printToTextFile() throws FileNotFoundException, InterruptedException
	{
		FileOutputStream fos= new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		for(int i=0; i<s.length();i++)
		{
			pw.write(s.charAt(i));
			Thread.sleep(3000);
			System.out.println("Printing....");
		}
		pw.flush();
	}
	public void modifyData(String s)
	{
		this.s=s;
	}
}
class B extends Thread
{
	A ref;
	B(A ref)
	{
		this.ref=ref;
	}
	@Override
	public void run() {
		try {
			ref.printToTextFile();
		} catch (Exception e) {
			System.out.println("Handled");
		} 
	}
}
class C extends Thread
{
	A ref;
	C(A ref)
	{
		this.ref=ref;
	}
	@Override
	public void run() {
		ref.modifyData("mango");
	}
}
public class Multi5 {

	public static void main(String[] args) throws InterruptedException {
		A ref = new A();
		B t1 = new B(ref);
		C t2 = new C(ref);
		t1.start();
		Thread.sleep(3000);
		t2.start();
	}

}
