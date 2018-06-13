
public class QueueArr 
{
	private int a[];
	int rear = -1;
	int front = -1;
	
	QueueArr(int size)
	{
		a= new int[size];
	}
	
	void add(int v)
	{
		if(rear+1 == front)
			System.out.println("Queue is full");
		else
			a[++ rear]=v;
	}
	
	int remove() throws Exception
	{
		if(rear==front)
			throw new Exception ("queue is empty");
		else
			return a[++front];		
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
			return a[front+1];		

	}
}
