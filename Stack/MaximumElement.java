import java.util.Scanner;
import java.util.Stack;

public class MaximumElement
{

	public static void main(String[] args) 
	{
	      Scanner sc= new Scanner(System.in);
			Stack<Integer> min = new Stack<Integer>();
			Stack<Integer> max = new Stack<Integer>();
			System.out.println("enter no of  element");
			int no= sc.nextInt();
			int input;
			int recent = 0;
			for(int i=0;i<no;i++)
			{
				input = sc.nextInt();
				if(input==1)
				{
				System.out.println("enter element to push");
					input = sc.nextInt();
					if(max.empty())
						max.push(input);
					else if(input>max.peek())
						max.push(input);
					else
						min.push(input);
					
					recent=input;
				}
				else if(input == 2)
				{
					if((!max.empty()) && (recent==max.peek()))
						max.pop();
					else if(!min.empty())
						min.pop();
	                   
					System.out.println("element deleted");
				}
				else if(input==3)
				{
	                if(max.empty())
	                    System.out.println("0");
	                else
					System.out.println(max.peek());				
				}
			}

	}

}
