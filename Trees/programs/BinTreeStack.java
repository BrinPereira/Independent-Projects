import java.util.Stack;

public class BinTreeStack 
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
// preorder traversal using Stack
		void preorder()
		{
			Stack<Node> s = new Stack<Node>();
			Node p = root;
			while(true)
			{
				while(p!=null)
				{
					System.out.println(p.getData());
					s.push(p);
					p=p.getLeft();
				}
				if(!s.empty())
				{
					p=s.pop();
					p = p.getRight();
				}
				else 
					break;
			}			
		}

		void inorder()
		{
			Stack<Node> s = new Stack<Node>();
			Node p = root;
			while(true)
			{
				while(p!=null)
				{
					s.push(p);
					p=p.getLeft();
				}
				if(!s.empty())
				{
					p=s.pop();
					System.out.println(p.getData());
					p = p.getRight();
				}
				else 
					break;
			}			
		}
		
		void postorder()
		{
						
		}
}
