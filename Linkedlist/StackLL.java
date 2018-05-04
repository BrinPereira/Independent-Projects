package ctcci;

import java.util.Scanner;

public class StackLL 
{
	Node last;
	
	// stack push in LL
	void push(int v)
	{
		Node p = new Node();
		p.setData(v);
		p.setNext(last);
		last = p;
	}
	
	// stack pop in LL
	int pop() throws Exception
	{
		if(last==null)
			throw new Exception("Stack is empty");
		else
		{
			int a = last.getData();
			last = last.getNext();
			return a;
		}		
	}
	
	// stack peep in LL
	int peek() throws Exception
	{
		if(last == null)
			throw new Exception("Stack is empty");
		else
		{
			int a =last.getData();
			return a;
		}
	}
	
	// empty the stack
	boolean emptyStack()
	{
		return last==null;
	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		StackLL obj1 = new StackLL();
			
		// creating first linklist by pushing elements
		System.out.println("Enter no of elemnets you want to enter for linkedlist");
		int n =sc.nextInt();
		System.out.println("enter elemnts of linked list 1");
		for(int i=0 ; i<n;i++)
		{
			int element = sc.nextInt();
			obj1.push(element);
		}
		
		// pop the top elemnents
	
			int v = obj1.pop();
			System.out.println("Element pop: " + v);
		
		// peek the top element in the stack
		
			int element = obj1.peek();
			System.out.println("Element on top: " + element);
		
		// is stack empty
		
		System.out.println("is stack empty ?" + obj1.emptyStack());
		
	}
}



















