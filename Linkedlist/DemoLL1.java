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
		
		// displaying elements of LL
		System.out.println("Elements are :");
		obj2.display();		
		
		// insert elements in sorted elements
		System.out.println("enter element to inserted in the order list ");
		int v= sc.nextInt();
		obj2.insertOrder(v);
		obj2.display();
		
		//remove duplicates from linkedlist
		obj2.duplicate();
		obj2.display();
				
		// display element from kth position to last
		System.out.println("enter kth poistion");
		int kpos = sc.nextInt();
	    obj2.k_last(kpos);
	
	   // delete the middle element of linkedlist 
	    obj2.middle_delete();
	    obj2.display();
				
	}
}
