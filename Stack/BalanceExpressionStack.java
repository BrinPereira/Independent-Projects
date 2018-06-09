import java.util.Scanner;

public class BalanceExpressionStack
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("Enter expression");
		String s = sc.nextLine();
		
		char a[]=s.toCharArray();
		
		Stack sobj = new Stack(a.length);
		try
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]=='(')
					sobj.push(a[i]);
				if(a[i]==')')
					sobj.pop();
			}
		}
		catch(Exception e)
		{
			flag=false;
		}
		
		if(sobj.empty()&& flag)
			System.out.println("Balanced");
		else
			System.out.println("UnBalanced");
		
	}

}
