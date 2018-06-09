import java.util.Scanner;

public class BinaryStack 
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number");
		int no = sc.nextInt();
		Stack s = new Stack(no);
		
		while(no!=0)
		{
			s.push(no%2);
			no=no/2;
		}
		
		while(!s.empty())
		{
			System.out.print(s.pop());
		}

	}

}
