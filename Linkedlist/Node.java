package ctcci;

public class Node
{
	 int data;
	 Node next;
	
	void setData(int v)
	{
		data = v;
	}
	
	void setNext(Node x)
	{
		next =x;
	}
	
	int getData()
	{
		return data;
	}
	
	Node getNext()
	{
		return next;
	}
}
