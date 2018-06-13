import java.util.Scanner;
import java.util.Stack;

public class PostFixExpr 
{
	static void evaluatepostfix(String e)
	{
		Stack<Integer> s = new Stack<>();
		
		char[] exp = e.toCharArray();
		
		for(int i =0; i<exp.length;i++)
		{
			if(Character.isDigit(exp[i]))
				s.push(exp[i]-48);
			else
			{
				int v = s.pop();
				int q = s.pop();
				
				switch(exp[i])
				{
				case '+' : s.push(q+v);
					break;
				case '-' : s.push(q-v);
					break;
				case '*' : s.push(q*v);
					break;
				case '/' : s.push(q/v);
					break;
				case '^' : s.push(q^v);
					    
				}
			}
		}
		
		System.out.println("Result: " + s.pop());		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postFix expression:");
		String expr = sc.nextLine();
		evaluatepostfix(expr);
	}

}
