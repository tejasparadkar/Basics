import java.util.Scanner;
class RawAgent 
{
	private int rawAgentBatchId;
	private String rawAgentCodeName;
	private String rawAgentMissionName;
	
	public int getRawAgentBatchId()
	{
		return rawAgentBatchId;
	}
	public String getRawAgentCodeName()
	{
		return rawAgentCodeName;
	}
	public String getRawAgentMissionName()
	{
		return rawAgentMissionName;
	}

	public void setRawAgentBatchId(int rawAgentBatchId)
	{
		this.rawAgentBatchId=rawAgentBatchId;
	}
	public  void setRawAgentCodeName(String rawAgentCodeName)
	{
		this.rawAgentCodeName=rawAgentCodeName;
	}
	public void setRawAgentMissionName(String rawAgentMissionName)
	{
		this.rawAgentMissionName=rawAgentMissionName;
	}
	
	RawAgent (int rawAgentBatchId, String rawAgentCodeName, String rawAgentMissionName)
	{
		this.rawAgentBatchId=rawAgentBatchId;
		this.rawAgentCodeName=rawAgentCodeName;
		this.rawAgentMissionName=rawAgentMissionName;
	}	
}
class IndianSecretUnit
{
	public static void print(int i, String j, String k)
	{	
		System.out.println("==========================");
		System.out.println("Old Details are: ");
		System.out.println("Batch ID: "+i);
		System.out.println("Code name: "+j);
		System.out.println("Mission name: "+k);
	}
	public static void upPrint(int i, String j, String k)
	{	
		System.out.println("==========================");
		System.out.println("New Details are: ");
		System.out.println("Batch ID: "+i);
		System.out.println("Code name: "+j);
		System.out.println("Mission name: "+k);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("Enter Batch Id:");
		int a=s.nextInt	();
		System.out.println("Enter Code Name:");
		s.nextLine();
		String b=s.nextLine();
		System.out.println("Enter Mission Name:");
		String c=s.nextLine();
		RawAgent a1 = new RawAgent(a,b,c);
		print(a1.getRawAgentBatchId(),a1.getRawAgentCodeName(),a1.getRawAgentMissionName());
		a1.setRawAgentBatchId(123);
		a1.setRawAgentCodeName("Bond");
		a1.setRawAgentMissionName("Moscow");
		upPrint(a1.getRawAgentBatchId(),a1.getRawAgentCodeName(),a1.getRawAgentMissionName());
		
		System.out.println("========================");
		System.out.println("Enter Batch Id:");
		int d=s.nextInt();
		System.out.println("Enter Code Name:");
		s.nextLine();
		String e=s.nextLine();
		System.out.println("Enter Mission Name:");
		String f=s.nextLine();
		RawAgent a2 = new RawAgent(d,e,f);
		print(a2.getRawAgentBatchId(),a2.getRawAgentCodeName(),a2.getRawAgentMissionName());
		a2.setRawAgentBatchId(234);
		a2.setRawAgentCodeName("Sherlock");
		a2.setRawAgentMissionName("Iran");
		upPrint(a2.getRawAgentBatchId(),a2.getRawAgentCodeName(),a2.getRawAgentMissionName());

		System.out.println("========================");
		System.out.println("Enter Batch Id:");
		int g=s.nextInt();
		System.out.println("Enter Code Name:");
		s.nextLine();
		String h=s.nextLine();
		System.out.println("Enter Mission Name:");
		String i=s.nextLine();
		RawAgent a3 = new RawAgent(g,h,i);
		print(a3.getRawAgentBatchId(),a3.getRawAgentCodeName(),a3.getRawAgentMissionName());
		a3.setRawAgentBatchId(345);
		a3.setRawAgentCodeName("Superman");
		a3.setRawAgentMissionName("America");
		upPrint(a3.getRawAgentBatchId(),a3.getRawAgentCodeName(),a3.getRawAgentMissionName());

		System.out.println("========================");
		System.out.println("Enter Batch Id:");
		int j=s.nextInt();
		System.out.println("Enter Code Name:");
		s.nextLine();
		String k=s.nextLine();
		System.out.println("Enter Mission Name:");
		String l=s.nextLine();
		RawAgent a4 = new RawAgent(j,k,l);
		print(a4.getRawAgentBatchId(),a4.getRawAgentCodeName(),a4.getRawAgentMissionName());
		a4.setRawAgentBatchId(456);
		a4.setRawAgentCodeName("Bagheera");
		a4.setRawAgentMissionName("Tokyo");
		upPrint(a4.getRawAgentBatchId(),a4.getRawAgentCodeName(),a4.getRawAgentMissionName());

		System.out.println("========================");
		System.out.println("Enter Batch Id:");
		int m=s.nextInt();
		System.out.println("Enter Code Name:");
		s.nextLine();
		String n=s.nextLine();
		System.out.println("Enter Mission Name:");
		String o=s.nextLine();
		RawAgent a5 = new RawAgent(m,n,o);
		print(a5.getRawAgentBatchId(),a5.getRawAgentCodeName(),a5.getRawAgentMissionName());
		a5.setRawAgentBatchId(789);
		a5.setRawAgentCodeName("Himmat");
		a5.setRawAgentMissionName("Seoul");
		upPrint(a5.getRawAgentBatchId(),a5.getRawAgentCodeName(),a5.getRawAgentMissionName());
	}
}
