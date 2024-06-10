package string;
//WAJP to convert Int to Roman
public class StringIntToRoman {
	public static String intToRoman(int num) {
        String roman="";
        while(num!=0)
        {
            if(num>=1000)
            {
                roman=roman+"M";
                num=num-1000;
            }
            else if(num<1000 && num>=500)
            {
                if(num>=900&&num<1000)
                {
                    roman=roman+"CM";
                    num=num-900;
                    
                }
                else 
                {
                    roman=roman+"D";
                    num=num-500;
                }
            }
            else if(num<500 && num>=100)
            {
                if(num>=400&&num<500)
                {
                    roman=roman+"CD";
                    num=num-400;
                    
                }
                else 
                {
                    roman=roman+"C";
                    num=num-100;
                }
            }
            else if(num<100 && num>=50)
            {
                if(num>=90&&num<100)
                {
                    roman=roman+"XC";
                    num=num-90;
                    
                }
                else 
                {
                    roman=roman+"L";
                    num=num-50;
                }
            }
            else if(num<50 && num>=10)
            {
                if(num>=40&&num<50)
                {
                    roman=roman+"XL";
                    num=num-40;
                    
                }
                else 
                {
                    roman=roman+"X";
                    num=num-10;
                }
            }
            else if(num<10 && num>=5)
            {
                if(num>=9&&num<10)
                {
                    roman=roman+"IX";
                    num=num-9;
                   
                }
                else 
                {
                    roman=roman+"V";
                    num=num-5;
                }
            }
            else if(num<5 && num>=1)
            {
                if(num>=4&&num<5)
                {
                    roman=roman+"IV";
                    num=num-4;
                 
                }
                else 
                {
                    roman=roman+"I";
                    num=num-1;
                }
            }
            
        }
        return roman;
    }
	public static void main(String[] args) {
		int n = 3749;
		System.out.println(intToRoman(n));
		
	}

}
