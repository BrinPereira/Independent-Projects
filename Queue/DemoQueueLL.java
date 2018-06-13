import java.util.Scanner;

public class DemoQueueLL {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				QueueLL obj = new QueueLL();
				System.out.println("Enter the number of elements");
				int no = sc.nextInt();
				System.out.println("Enter elements");
				for(int i=0 ; i<no;i++)
				{
					int v = sc.nextInt();
					obj.add(v);
				}
				
				try
				{
					obj.remove();
					obj.peek();
					System.out.println(obj.empty());		
				}
				catch(Exception e)
				{
					System.out.println(e);
				}


	}

}
