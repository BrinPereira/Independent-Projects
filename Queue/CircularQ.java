
public class CircularQ 
{

	private int a[];
	int rear = -1;
	int front = -1;
	
	CircularQ(int size)
	{
		a= new int[size];
	}
	
	void add(int v)
	{
		if((rear+1)%a.length == front)
			System.out.println("Queue is full");
		else
		{
			rear = (rear+1)%a.length;
			a[rear]=v;

		}
	}
	
	int remove() throws Exception
	{
		if(rear==front)
			throw new Exception ("queue is empty");
		else
		{
			front = (front+1)%a.length;
			return a[front];		
		}			
	}
	
	boolean empty()
	{
		return rear==front;
	}
	
	int peek() throws Exception
	{
		if(rear==front)
			throw new Exception ("queue is empty");
		else
			return a[(front+1)%a.length];		

	}
}
