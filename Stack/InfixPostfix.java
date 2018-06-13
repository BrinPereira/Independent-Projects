import java.util.Stack;
public class InfixPostfix 
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
		String post= "";
		char a[] = infixexp.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isLetterOrDigit(a[i]))
				post+=a[i];
			else
			{
				if(s.empty() ||  a[i] =='(' || (precedance(a[i] )> precedance(s.peek())) || a[i]=='^' )
				{
					s.push(a[i]);
				}
				else
				{
					if(a[i]==')')
					{
						while(s.peek()!='(')
						{
							post+=s.pop();
						}
						s.pop();
					}
					else
					{
						while(!s.empty() && precedance(a[i])<= precedance(s.peek()))
								{
									post+=s.pop();
								}
						s.push(a[i]);
					}
				}
			}
		}
		while(!s.empty())
			post+=s.pop();
		
	System.out.println("PostFix expression is :" + post);
	}
}
