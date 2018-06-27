
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

	
// level order traversal
	
	void levelorder()
	{
		int h = height(root);
		for(int i = 0 ;i<=h;i++)
		{
			levelorder(root,i+1);
		}		
	}

	void levelorder(Node p , int h)
	{
		if(p==null)
			return ;
		if(h==1)
			System.out.println(p.getData());
		else if(h>1)
		{
			levelorder(p.getLeft() , h-1);
			levelorder(p.getRight() , h-1);
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
	
// search for element in the tree 
	boolean search(int v)
	{
		Node p =root;
		boolean check = false;
		 if(v==p.getData())
			 check = true;
		 else
		 {
			 while(p!=null)
			 {
				 if(v>p.getData())
				 {
					if(v==p.getData()) 
					{
						check = true;
						break;
					}
					p=p.getRight();					
				 }
				 else
				 {
					 if(v==p.getData()) 
						{
							check = true;
							break;
						}
					 p=p.getLeft();						
				 }			 		
			 }
		
		 }
		 
		 return check;
	}

// count number of leaf node
	
	int  leaves()
	{
	  return leaf(root);
	}
	
	int leaf(Node p)
	{
		if(p==null)
			return 0;
		
		if(p.getRight()==null && p.getLeft()==null)
			return 1;
		else
		{
			int x = leaf(p.getLeft());
			int y= leaf(p.getRight());
			return x+y;
		}
	}

// delete node from the binary tree	
	boolean delBst(int v)
	{
// Search for the element in the tree
		Node p = root, prev=null , succ = null;
		while(p!=null)
		{
			if(p.getData()==v)
				break;
			prev =p;
			if(p.getData()>v)
				p=p.getLeft();
			else
				p=p.getRight();
		}
		
		if(p==null)
			return false;		
// if the node to be deleted has both the subtrees, replace the value of the node either with inorder proceeder.
// After replacing,  delete proceeder 
		if(p.getLeft()!=null && p.getRight()!=null)
		{
			prev = p;
			succ = p.getRight();
			while(succ.getLeft()!=null)
			{
				prev = succ;
				succ = succ.getLeft();
			}
			p.setData(succ.getData());
			p=succ;
		}
// if the node to be deleted is root node and has only left or right , then transfer non empty subtree to the reference of the root.	
// if the node to be deleted is root node and has no subtree then put null .
// if the node to be deleted is root node and has only one subtree then transfer the non empty subtree to the reference of the root.
		if(root == p)
		{
			if(p.getLeft()!=null)
				root = p.getLeft();
			else
				root = p.getRight();
		}	
		else if(p.getLeft()==null && p.getRight()==null)
		{
			if(prev.getLeft()==p)
				prev.setLeft(null);
			else
				prev.setRight(null);
		}
		else if(p.getLeft()==null && p.getRight()!=null)
		{
			if(prev.getLeft()==p)
				prev.setLeft(p.getRight());
			else
				prev.setRight(p.getRight());
		}
		else if(p.getLeft()!=null && p.getRight()==null)
		{
			if(prev.getLeft()==p)
				prev.setLeft(p.getLeft());
			else
				prev.setRight(p.getLeft());
		}
		
	return true;	
	}	
}
