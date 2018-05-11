package ctcci;

public class LinkListFunc
{
	Node first;

	// creating linkedlist
	void add(int v)
	{
		Node q = new Node();
		
		if(first==null)
		{
			q.setData(v);
			first=q;
		}
			
		else
		{
			Node p = first;
			q.setData(v);
			while(p.getNext()!=null)
				{
				p= p.getNext();
				}
			p.setNext(q);
			}
	}
	
	// displaying linkedlist
	void display()
	{
		Node p= first;
		while(p!=null)
		{
			System.out.println(p.getData());
			p=p.getNext();
		}
	}
	
	// searching element in linked list
	boolean search(int v)
	{
		Node p = first;
		try
		{
			while(p.getData()!= v)
			{
				p=p.getNext();
			}
			
			if(v==p.getData())
				return true;		
		}
		catch (Exception e)	{}				
		return false;
		
	}
	
	// finding maximum element from the linked list
	int maximum()
	{
		Node p= first;
		int max =p.getData();
		
		while(p!=null)
		{
			if(max< p.getData())
				max=p.getData();
			p=p.getNext();
			
		}
		
		return max;
		
	}
	
	
	// insert element in beginning
	
	void insertBegin(int v)
	{
		Node p = first;
		Node q= new Node();
		q.setData(v);
		first =q;
		q.setNext(p);
      System.out.println("Element added at begining successfully");
		
	}
	
	// insert at random places
	
	void insertRandom(int v, int pos)
	{
		Node q= new Node();
		q.setData(v);
		
		if(pos==1)
		{
			q.setNext(first);
			first=q;
		}
		else
		{
			Node p = first;
			int c =1;
			while((c!=(pos-1)) && p.getNext()!=null)
			{
				c++;
				p=p.getNext();
			}
			
			if(c==(pos-1))
			{
				q.setNext(p.getNext());
				p.setNext(q);
				System.out.println("Element inserted at position:" + pos);
			}
			
			else
				System.out.println("position not found");
		}
		
	}
	
	
// delete the element from the linkedlist	
	void delete(int v)
	{

		Node p= first;
		Node x= new Node();
		
		try
		
		{while((p.getData())!= v)
			{
				x=p;
				p=p.getNext();
			}
			
			if((p.getData())==v)
			{
				x.setNext(p.getNext());
				System.out.println("element deleted successfully");
			}
			
		}
		catch (Exception e) {
			System.out.println("element not found");}
	}
	
// reverse the list 
	
	void reverseList()
	{
		Node p = first;
		Node prev= null;
		
		while(p!=null)
		{
			Node t = p.getNext();
			p.setNext(prev);
			prev = p;
			p=t;
		}
		
		first = prev;
	}
	
// 	insert in order list
	
	void insertOrder(int v)
	{
		Node p = first;
		Node prev = null;
		
		while(p!=null)
		{
			if(p.getData()>v)
				break;
			prev = p;
			p=p.getNext();				
		}
		
		Node q = new Node();
		q.setData(v);
		if(p==first)
		{
			q.setNext(first);
			first = q;
		}
		else
		{
		q.setNext(p);
		prev.setNext(q);
		
		}
	}
	
	// copy linked list from one to another
	
	void copy()
	{
		LinkListFunc x = new LinkListFunc();
		Node p= first;
		while(p!=null)
		{
			x.add(p.getData());
			p=p.getNext();
		}
		
		System.out.println("LinkedList copied successfully");
		x.display();
	}
	
	// intersection of two linked list
	
	LinkListFunc intersects(LinkListFunc t)
	{
		LinkListFunc z = new LinkListFunc();
		Node p1= first;
		Node p2= t.first;
		while(p1!=null)
		{
			while(p2!=null)
			{
				if(p1.getData()==p2.getData())
					break;
				p2=p2.getNext();
			}
			
			if(p2!=null)
			z.add(p1.getData());
			
			p1=p1.getNext();
			p2=t.first;
	}	
			return z;
	}
	
// union of two linked list	
	
	LinkListFunc union(LinkListFunc t)
	{
		LinkListFunc z = new LinkListFunc();
		Node p1= first;
		Node p2 = t.first;
		
		while(p2!=null)
		{
			z.add(p2.getData());
			p2=p2.getNext();
		}
		
		while(p1!=null)
		{
			while(p2!=null)
			{
				if(p1.getData()==p2.getData())
				 break;
				p2=p2.getNext();
			}
			
			if(p2==null)
				z.add(p1.getData());
			p1=p1.getNext();
			p2=t.first;
		}
		return z;
	}
	
	// remove duplicates from linkedlist
	
	void duplicate()
	{
		 Node p = first;
		 Node q = first;
		 
		 while(q.getNext()!=null)
		 {
			 p = q;
			 while(p.getNext()!=null)
			 {
				 Node x = p;
				 p= p.getNext();
				 if(p.getData()==q.getData())
				 {
					 x.setNext(p.getNext());
					 System.out.println(" Element " + q.getData()+ " deleted ");
				 }
			 }
			 
			 q=q.getNext();
		 }
			 
	 }
	
	
	// return kth last element
	void k_last(int pos)
	{
		Node p = first;
		int c = 1;
		while(c!=(pos) && p.getNext()!=null)
		{
			c++;
			p=p.getNext();
		}
		
		if(c==pos)
		{
			while(p!=null)
			{
				System.out.println(p.getData());
				p=p.getNext();
			}
		}
	}
	
	
}























