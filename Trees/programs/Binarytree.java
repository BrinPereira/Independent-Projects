
public class Binarytree 
{
	Node root;

// insert node in binary tree
	void insert(int v)
	{
		Node q = new Node();
		q.setData(v);
		
		if(root==null)
			root = q;
		else
		{
			Node previous = null;
			Node p = root;
			
			while(p!=null)
			{
				previous = p;
				
				if(p.getData()>v)
					p=p.getLeft();
				else
					p=p.getRight();
			}
				
				if(previous.getData()>v)
					previous.setLeft(q);
				else
					previous.setRight(q);
		}		
	}
	
	
// preorder traversal
	void preorder() 
	{
		preorder(root);
	}
	
	void preorder(Node p)
	{
		if(p==null)
			return;
		else
		{
			System.out.println(p.getData());
			preorder(p.getLeft());
			preorder(p.getRight());	
		}
	}

	
// inorder traversal	
	void inorder() 
	{
		inorder(root);
	}
	
	void inorder(Node p)
	{
		if(p==null)
			return;
		else
		{
			inorder(p.getLeft());
			System.out.println(p.getData());
			inorder(p.getRight());
		}
	 }
	
// postorder traversal
	void postorder() 
	{
		postorder(root);
	}
	
	void postorder(Node p)
	{
		if(p==null)
			return;
		else
		{
			postorder(p.getLeft());
			postorder(p.getRight());
			System.out.println(p.getData());			
		}
	 }		


// for counting no. of nodes 
	int count(Node p)
	{
		if(p==null)
		{
			return 0;
		}
		else
		{
			int x = count(p.getLeft());
			int y = count (p.getRight());
			return x+y+1;
		}
	}
	
	int count()
	{
		int x = count(root);
		return x;
	}
		
// Find height of tree
	int height(Node x)
	{
		if((x==null) || (x.getLeft()==null && x.getRight()==null))
			return 0;
		else
		{
			int a = height(x.getLeft());
			int b = height(x.getRight());
			if(a>b)
				return a+1;
			else
				return b+1;
		}
	}
	
	int height()
	{
		return height(root);
	}
	
// Largest element in the binary tree
	int largest()
			{
				Node p = root.getRight();
				int m = p.getData();
				while(p!=null)
				{
					m=p.getData();
					p=p.getRight();
				}
			return m;	
			}
	
	
	
}
