package string;

import java.util.Stack;

public class StringBalancedBracket 
{

	public static void main(String[] args) 
	{
		String s="{[()]}";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
				continue;
			}
			else if(stack.isEmpty())
			{
				System.out.println("Unbalanced-*");
				return;
			}
			char pop = stack.pop();
			switch(pop)
			{
			case '{':
				if (s.charAt(i)==')'||s.charAt(i)==']') 
				{
					System.out.println("Unbalanced-1");
					return;
				}
				break;
			case '(':
				if (s.charAt(i)=='}'||s.charAt(i)==']') 
				{
					System.out.println("Unbalanced-2");
					return;
				}
				break;
			case '[':
				if (s.charAt(i)==')'||s.charAt(i)=='}') 
				{
					System.out.println("Unbalanced-3");
					return;
				}
				break;
			}
		}
		if (stack.isEmpty()) {
			System.out.println("Balanced");
		} 
		else 
		{
			System.out.println("Unbalanced-");
		}

	}

}
