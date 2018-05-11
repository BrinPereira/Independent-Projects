package ctcci;

import java.util.Scanner;

public class DemoLL
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		LinkListFunc obj = new LinkListFunc();
		
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
		
		// search element in unsorted elementm
		System.out.println("Enter elements to be search");
		int a = sc.nextInt();
		System.out.println(obj.search(a));
		
		// finding maximum element from the list
		System.out.println("Maximum Elements :" + obj.maximum());
		
		// adding element at begining 
		System.out.println("Enter element to be added at the begining");
		int no1 = sc.nextInt();
		obj.insertBegin(no1);
		obj.display();
		
		//adding element at particular position
		System.out.println("Enter element to be added :");
		int no2 = sc.nextInt();
		System.out.println("enter position ");
		int pos =sc.nextInt();
		obj.insertRandom(no2, pos);
		obj.display();
		
		// element to be deleted from the list
		System.out.println("Enter number to be deleted");
		int no3 = sc.nextInt();
		obj.delete(no3);
		obj.display();
		
		//revere the linked list
		System.out.println("reverse linked list");
		obj.reverseList();
		obj.display();
		
		// copy the linkedlist from one to other		
		obj.copy();
	}
}
