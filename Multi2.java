package multithreading;


public class Multi2 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=15;i++)
		{
			System.out.println(i+" "+getName());
		}
	}

	public static void main(String[] args) 
	{
		Multi2 ref1 = new Multi2();
		Multi2 ref2 = new Multi2();
		ref1.setName("Process1");
		ref2.setName("Process2");
		ref1.start();
		ref2.start();

	}

}
