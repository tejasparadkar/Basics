package multithreading;

public class Multi3 implements Runnable{
	@Override
	public void run() {
		for(char ch='a';ch<'n';ch++)
		{
			System.out.println(ch);
		}		
	}

	public static void main(String[] args) {
		Multi3 ref1 = new Multi3();
		Multi3 ref2 = new Multi3();
		Thread t1= new Thread(ref1);
		Thread t2= new Thread(ref2);
		t1.start();
		t2.start();

	}

}
