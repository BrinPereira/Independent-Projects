import java.util.Stack;

public class InfixPrefix
{
	int precedance(char op)
	{
		switch(op)
		{
		case '^' :
		case '$':
			return 4;
		case '*':
		case '/':
		case '%':
			return 3;
		case '+':
		case '-':
			return 2;
		case ')':
		case '(':
			return 1;
		}
		
		return 0;
	}
	
	void conversion(String infixexp)
	{
		String pre= "";
		char a[] = infixexp.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for(int i=a.length-1;i>=0;i--)
		{
			if(Character.isLetterOrDigit(a[i]))
				pre+=a[i];
			else
			{
				if(s.empty() ||  a[i] ==')' || (precedance(a[i] )>= precedance(s.peek())) || a[i]!='^' )
				{
					s.push(a[i]);
				}
				else
				{
					if(a[i]=='(')
					{
						while(s.peek()!=')')
						{
							if(s.peek()=='(' || s.peek()==')')
								s.pop();
							else
								pre+=s.pop();
							
						}
						s.pop();
					}
					else
					{
						while(!s.empty() && precedance(a[i])< precedance(s.peek()))
								{
							if(s.peek()=='(' || s.peek()==')')
								s.pop();
							else
								pre+=s.pop();	
								}
						s.push(a[i]);
					}
				}
			}
		}
		while(!s.empty())
			{
			if(s.peek()=='(' || s.peek()==')')
				s.pop();
			else
				pre+=s.pop();
			}
	
		String rev ="";
	for(int i=pre.length()-1; i>=0;i--)	
		rev+=pre.charAt(i);
	System.out.println("PreFix expression is :" + rev);
	}

}
