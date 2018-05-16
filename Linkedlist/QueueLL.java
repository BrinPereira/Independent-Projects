package ctcci;

import java.util.Scanner;

public class QueueLL 
{
	
	Node rear , front;
	
	void add(int v)
	{
		Node p =new Node();
		p.setData(v);
		if(rear==null)
			rear = front = p;
		else
		{
			rear.setNext(p);
			rear = p;
		}
	}
	
	int remove () throws Exception
	{
		if(front==null)
			throw new Exception ("Queue is empty");
		else
		{
			int v = front.getData();
			front = front.getNext();
			return v;
		}
	}
	
	int peek() throws Exception
	{
		if(front==null)
			throw new Exception("Queue is empty");
		else
		{
			int v = front.getData();
			return v;
		}
	}
	
	boolean empty()
	{
		return front == null;
	}
	
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		QueueLL q = new QueueLL();
	
		//add elements
		System.out.println("Enter no of elemnets you want to enter for queue");
		int n =sc.nextInt();
		System.out.println("enter elemnts of queue");
		for(int i=0 ; i<n;i++)
		{
			int element = sc.nextInt();
			q.add(element);
		}
		
		// remove the top elemnents	
			int v = q.remove();
			System.out.println("Element pop: " + v);
		
		// peek the top element in the queue	
			int element = q.peek();
			System.out.println("Element on top: " + element);
		
		// is queue empty		
		System.out.println("is stack empty ?" + q.empty());
	
	}

}
