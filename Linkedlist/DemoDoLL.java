package ctcci;

import java.util.Scanner;

public class DemoDoLL 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		DoubleLL obj = new DoubleLL();
		
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
		
		System.out.println("Enter element to be added :");
		int no2 = sc.nextInt();
		System.out.println("enter position ");
		int pos =sc.nextInt();
		obj.insertRandom(no2, pos);;
		obj.display();
		System.out.println("Enter element to be deleted ");
		int v = sc.nextInt();
		obj.delete(v);
		obj.display();
		
		
		// deleting duplicates
		System.out.println("linkedlist after deleting duplicates");
		obj.duplicate();
		obj.display();
		
		// dispaly element from kth position to last
		System.out.println("enter kth poistion");
		int kpos = sc.nextInt();
	    obj.k_last(kpos);
	
	}

}
