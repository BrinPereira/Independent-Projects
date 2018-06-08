import java.util.Scanner;

public class StackDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Stack s = new Stack();
		int c;
		
	
		do
		{
			System.out.println();
			System.out.println("Enter operations to be performed: \n push- press 1 \n pop - press 2 \n peek - press 3 "
					+ "\n empty- press 4 \n exit-press 5");
			
			 c = sc.nextInt();
			
			switch(c)
			{
			case 1: System.out.println("enter element:");
					int v = sc.nextInt();
					s.push(v);
					break;
			case 2: try {
					System.out.println("Element popped " + s.pop());
						} 
					catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
					break;
			case 3: try {
					System.out.println("element on top of stack:" + s.peek());
					} 
					catch (Exception e) 
					{
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
					break;
			case 4: System.out.println("Is stack empty ? " + s.empty());
					break;
			default: System.exit(0);
			
			}
		} while(c!=5);
			
	}

}
