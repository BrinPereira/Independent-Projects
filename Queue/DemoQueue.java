import java.util.Scanner;

public class DemoQueue
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the queue");
		int size = sc.nextInt();
		QueueArr obj = new QueueArr(size);
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
			System.out.println(obj.remove());
			System.out.println(obj.peek());
			System.out.println(obj.empty());		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
