package ctcci;

import java.util.Scanner;

public class DemoLL2
{
	public static void main(String[] args) 
	{
		// copy a list to another list 
		
		Scanner sc= new Scanner(System.in);
		LinkListFunc obj1 = new LinkListFunc();
		LinkListFunc obj2 = new LinkListFunc();
		
		
		// creating first linklist
		System.out.println("Enter no of elemnets you want to enter for linkedlist");
		int n =sc.nextInt();
		System.out.println("enter elemnts of linked list 1");
		for(int i=0 ; i<n;i++)
		{
			int element = sc.nextInt();
			obj1.add(element);
		}
		
		System.out.println("Elements of linkedlist 1 are :");
		obj1.display();		// displaying elements of LL
		
		
		System.out.println("Enter no of elemnets you want to enter for linkedlist");
		int m =sc.nextInt();
		System.out.println("enter elemnts of linked list 2");
		for(int i=0 ; i<m;i++)
		{
			int element = sc.nextInt();
			obj2.add(element);
		}
		
		System.out.println("Elements of linkedlist 2 are :");
		obj2.display();		// displaying elements of LL
		
		// intersection of two lists
		LinkListFunc obj3 =	obj1.intersects(obj2);
		System.out.println("Intrsect link list is:");
		obj3.display();
		
		// union of two lists
		LinkListFunc obj4 =	obj1.union(obj2);
		System.out.println("union link list is:");
		obj4.display();


	}

}
