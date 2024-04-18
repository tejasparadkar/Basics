package multithreading;

public class Multi4 implements Runnable{
	@Override
	public void run() {
		for(char ch='a';ch<'n';ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
		}
	}
	public static void main(String[] args) {
		Multi4 ref1 = new Multi4();
		Multi4 ref2 = new Multi4();
		Thread t1= new Thread(ref1);
		Thread t2= new Thread(ref2);
		t1.start();
		t2.start();

	}

}
