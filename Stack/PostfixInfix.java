import java.util.Scanner;
import java.util.Stack;

public class PostfixInfix 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postfix expression");
		String postfix = sc.nextLine();
		
		char a[] = postfix.toCharArray();
		Stack<String> s = new Stack<String>();
		String infix= "";
		
		for(int i=0;i<a.length;i++)
		{
			if(Character.isLetterOrDigit(a[i]))
				s.push(" " + a[i]);
			else
			{
				String op2 = s.pop();
				String op1 = s.pop();
				String temp = "(" + op1 + a[i] + op2 + ")";
				s.push(temp);
			}			
		}
	
		System.out.println(s.pop());
	}

}
