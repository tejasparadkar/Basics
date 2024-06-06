package string;

import java.util.Scanner;

/*A space explorer's ship crashed on Moon! They send a series of SOS messages to ISRO for help.
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by ISRO as a string, S , determine how many letters of the SOS message have been changed by radiation.
Example
S = "SOSTOT"
The original message was SOSSOS. Two of the message's characters were changed in transit.
Function Description
Complete the moonExploration function in the editor below.
moonExploration has the following parameter(s):
string s: the string as received on ISRO
Returns
int: the number of letters changed during transmission
Sample Input 0
SOSSPSSQSSOR
Sample Output 0
3
Explanation 0
S = SOSSPSSQSSOR, and signal length = 12. They sent 4 SOS messages (i.e.: 12/3=4 )*/

public class StringSOS {
	public static int countTamper(String s1)
	{
		if(s1.length()%3==0)
		{
			int i=s1.indexOf("S");
			int a=3;
			int count =0;
			for(;i<s1.length();i++)
			{
				String s2 = s1.substring(i, a);
				if(!s2.contains("SO"))
				{
					count++;
				}
				i=a-1;
				a=a+3;
			}
			return count;
		}
		else
		{
			System.out.println("Enter correct length of message");
			return 0;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the SOS message: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();		
		System.out.println(countTamper(s1)+" messages were tampered.");
	}
}
