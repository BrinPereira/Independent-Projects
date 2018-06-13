import java.util.LinkedList;

public class QueueLL
{
	LinkedList<Integer> object = new LinkedList<Integer>();
	
	
	void add(int v)
	{
		object.add(v);
	}
	
	void remove()
	{
		object.removeFirst();
	}
	
	void peek()
	{
		System.out.println(object.getFirst());
	}
	
	boolean empty()
	{
		return (object.getFirst()==null);
	}
	
}
