package ctcci;

import java.util.Scanner;

// Single circular LL

public class CircularLL
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
				q.setNext(first);
			}
				
			else
			{
				Node p = first.getNext();
				q.setData(v);
				while(p.getNext()!=first)
					{
					p= p.getNext();
					}
				p.setNext(q);
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
		CircularLL obj = new CircularLL();
		
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
