import java.util.Scanner;


public class DemoTree 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Binarytree obj = new Binarytree();
				
		// creating first linklist
		System.out.println("Enter no of elemnets you want to enter");
		int n =sc.nextInt();
		
		System.out.println("Enter the nodes:");
		for(int i=0 ; i<n;i++)
		{
			int element = sc.nextInt();
			obj.insert(element);
		}
		
		// traversal of nodes : preorder, inorder , postorder
		System.out.println("preorder traversal :");
		obj.preorder();	
		System.out.println("Inordertraversal :");
		obj.inorder();		
		System.out.println("Postorder traversal :");
		obj.postorder();
		
		//count no of nodes
		
		int no = obj.count();
		System.out.println("No of nodes in a tree :" + no);		
	}
}
