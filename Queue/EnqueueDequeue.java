import java.util.Stack;

public class EnqueueDequeue
{
  Stack <Integer> enq = new Stack<Integer>(); 
  Stack <Integer> deq = new Stack<Integer>();
  
  public void Enqueue(int v) 
  {
	  enq.push(v);	
	  System.out.println("element added to the queue");
  }

public void Dequeue()
{
		while(!enq.empty())
		{
			deq.push(enq.pop());
		}		
		System.out.println("Element removed fromthe queue " + deq.pop());
		
		while(!deq.empty())
		{
			enq.push(deq.pop());
		}
		
}

public void printFront()
{
	while(!enq.empty())
	{
		deq.push(enq.pop());
	}		
	System.out.println("Element in front of the queue " + deq.peek());	
	
	while(!deq.empty())
	{
		enq.push(deq.pop());
	}
	
}	
}
