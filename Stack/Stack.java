import java.util.Scanner;

public class Stack
{
	Scanner sc = new Scanner(System.in);
	int n=0;
	private int a[];
	private int top = -1;

	
	Stack()
	{
		System.out.println("Enter size of stack");
		n = sc.nextInt();
		a = new int[n];
	}
	
	Stack(int no) 
	{
		a=new int[no];
	}
	
	void push(int v)
	{
		if(top==a.length-1)
			System.out.println("Stack is full");
		else
			a[++top]=v;
	}
	
	int pop() throws Exception 
	{
		if(top==-1)
			throw new Exception("Stack Empty");
		else 
			return a[top--];
	}
	
	boolean empty()
	{
		return (top==-1);
	}
	
	int peek() throws Exception
	{
		if(top==-1)
			throw new Exception ("Stack is empty");
		else
			return a[top];
	}
}
