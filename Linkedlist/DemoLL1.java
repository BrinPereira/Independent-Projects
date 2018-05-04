package ctcci;

import java.util.Scanner;

public class DemoLL1 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		LinkListFunc obj2 = new LinkListFunc();
		
		// creating sorted/ordered linklist
		System.out.println("Enter no of order elemnets you want to enter");
		int n =sc.nextInt();
		for(int i=0 ; i<n;i++)
		{
			int element = sc.nextInt();
			obj2.add(element);
		}
		
		System.out.println("Elements are :");
		obj2.display();		// displaying elements of LL
		
		// insert elemnts in sorted elemnts
		System.out.println("enter element to inserted in the order list ");
		int v= sc.nextInt();
		obj2.insertOrder(v);
		obj2.display();
	}

}
