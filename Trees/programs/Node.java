
public class Node
{
	int data;
	Node left , right;
	
	void setData(int n)
	{
		data = n;
	}
	
	void setRight(Node x)
	{
		right=x;
	}
	
	void setLeft(Node x)
	{
		left = x;
	}
	
	int getData()
	{
		return data;
	}
	
	Node getRight()
	{
		return right;
	}
	
	Node getLeft()
	{
		return left;
	}
}
