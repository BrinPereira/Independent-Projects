package ctcci;

public class DoubleLL 
{

	Node first;

	// creating linkedlist
	void add(int v)
	{
		Node q = new Node();
		Node x= new Node();
		q.setData(v);
		
		if(first==null)
			first=q;		
		else
		{
			Node p = first;
			while(p.getNext()!=null)
				{
				x=p;
				p= p.getNext();
				}
			p.setNext(q);
			q.setPrev(p);
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

	// adding element at any position
	
	void insertRandom(int v , int pos)
	{
		Node q = new Node();
		q.setData(v);
		
		if(pos==1)
		{
			q.setNext(first);
			first.setPrev(q);
			first =q;
		}
		else
		{
			int c=1;
			Node p= first;
			while(c!=pos-1 && p.getNext()!= null)
			{
				c++;
				p=p.getNext();
			}
			
			if(c==pos-1)
			{
				q.setNext(p.getNext());
				q.setPrev(p);
				p.setNext(q);
			}
			else
			{
				System.out.println("Position not found");
			}
		}
		
	}
	
	// delete data from double linkedlist
	
	void delete(int v)
	{
		Node p = first;
		while(p.getNext()!=null)
		{
			if(v==p.getData())
				break;
			p=p.getNext();
		}
		
		if(p==first)
		{
			first = p.getNext();
			p= p.getNext();
			p.setPrev(null);
		}
		else
		{
			if(p.getNext()==null)
			{
				p.getPrev().setNext(null);
			}
			else
			{
				p.getPrev().setNext(p.getNext());
				p.getNext().setPrev(p.getPrev());
			}
		}
		
	}
	
	// remove duplicates from double linkedlist
	
	void duplicate()
	{
		 Node p = first;
		 Node q = first;
		 
		 while(q.getNext()!=null)
		 {
			 p = q;
			 while(p.getNext()!=null)
			 {
				 p= p.getNext();
				 if(p.getData()==q.getData())
				 {
					 p.getPrev().setNext(p.getNext());
					 p.getNext().setPrev(p.getPrev());
					 System.out.println(" Element " + q.getData()+ " deleted ");
				 }
			 }
			 
			 q=q.getNext();
		 }
			 
	}
	
	
	// displays kth to last element
	
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








