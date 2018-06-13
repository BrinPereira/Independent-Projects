import java.util.Scanner;
import java.util.Stack;

public class PostFix2 
{
	static void evaluatepostfix(String exp)
	{
		Stack<Integer> s = new Stack<>();
		
		String[] values =exp.split(" ");
		
		for(int i =0; i<values.length;i++)
		{
			try
			{
				s.push(Integer.parseInt(values[i]));
			}
			catch (Exception e)
			{
				int v = s.pop();
				int q = s.pop();
				
				switch(values[i])
				{
				case "+" : s.push(q+v);
					break;
				case "-" : s.push(q-v);
					break;
				case "*" : s.push(q*v);
					break;
				case "/" : s.push(q/v);
					break;
				case "^" : s.push(q^v);
				    break;
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
