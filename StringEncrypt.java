package string;

//Input: "Meet me at the clock tower"
//output: "M%%t #e AT th% ##o## TOWER"
//first group: vowel -> %
//second group: consonant -> #
//third group: whole word ->Uppercase

public class StringEncrypt {
	
	public static void main(String[] args) {
		String s = "Meet me at the clock tower";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			if(i%3==0)
			{
				char[] ch = a[i].toCharArray();
				for (int j = 0; j < ch.length; j++) {
					if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||
							ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U')
					{
						ch[j]='%';
					}					
				}
				a[i]=new String(ch);
			}
			else if(i%3==1)
			{
				char[] ch = a[i].toCharArray();
				for (int j = 0; j < ch.length; j++) 
				{
					if(ch[j]>='a'&& ch[j]<='z'||ch[j]>='A' && ch[j]<='Z')
					{
						if(ch[j]!='a'&&ch[j]!='e'&&ch[j]!='i'&&ch[j]!='o'&&ch[j]!='u'&&
								ch[j]!='A'&&ch[j]!='E'&&ch[j]!='I'&&ch[j]!='O'&&ch[j]!='U')
						{
							ch[j]='#';
						}	
					}
				}
				a[i]=new String(ch);
			}
			else if(i%3==2)			
			{			
				a[i]=a[i].toUpperCase();
			}
			System.out.print(a[i]+" ");
			
		}
	}
}
