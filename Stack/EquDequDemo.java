import java.util.Scanner;

public class EquDequDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		EnqueueDequeue obj = new EnqueueDequeue();
		System.out.println("press 1 : Enqueue element  into the end of the queue \n\n press 2: Dequeue the element at the front of the queue. \n\n"
				+ "press 3: Print the element at the front of the queue.\n\n press 4 : exit");
		
		int choice;
	do
	{
		choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("enter element");
				int v = sc.nextInt();
				obj.Enqueue(v);
				break;
		case 2: obj.Dequeue();
				break;
		case 3: obj.printFront();
				break;
		default : System.exit(0);
		
		}	
	} while(choice!=4);
		
	}

}
