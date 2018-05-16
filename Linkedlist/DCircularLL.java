package ctcci;

import java.util.Scanner;

public class DCircularLL 
{
	Node first;

	// creating linkedlist
	void add(int v)
	{
		Node q = new Node();
		Node x= new Node();
		q.setData(v);
		
		if(first==null)
		{
			first=q;
			q.setNext(first);
		}
					
		else
		{
			Node p = first.getNext();
			while(p.getNext()!=first)
				{
				x=p;
				p= p.getNext();
				}
			p.setNext(q);
			q.setPrev(p);
			q.setNext(first);
		}
	}
	
	// displaying linkedlist
	void display()
	{
		Node p = new Node();
		if(first!=null)
		{
			System.out.println(first.getData());
			 p= first.getNext();
		}
		while(p!=first)
		{
			System.out.println(p.getData());
			p=p.getNext();
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		DCircularLL obj = new DCircularLL();
		
		// creating first linklist
		System.out.println("Enter no of elemnets you want to enter");
		int n =sc.nextInt();
		for(int i=0 ; i<n;i++)
		{
			int element = sc.nextInt();
			obj.add(element);
		}
		
		System.out.println("Elements are :");
		obj.display();		// displaying elements of LL
	

	}

}
