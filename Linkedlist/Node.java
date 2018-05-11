package ctcci;

public class Node
{
	 int data;
	 Node next;
	 Node prev;
	
	void setData(int v)
	{
		data = v;
	}
	
	void setNext(Node x)
	{
		next =x;
	}
	
	void setPrev(Node n)
	{
		prev = n;
	}
	
	int getData()
	{
		return data;
	}
	
	Node getNext()
	{
		return next;
	}
	
	Node getPrev()
	{
		return prev;
	}
}
