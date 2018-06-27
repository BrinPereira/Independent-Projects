import java.util.Scanner;


public class DemoTree 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Binarytree obj = new Binarytree();
				
		
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
		System.out.println("Levelorder traversal :");
		obj.levelorder();		
		//count no of nodes
		int no = obj.count();
		System.out.println("No of nodes in a tree :" + no);	
		
		// printing height of tree
		System.out.println("Height of tree : " + obj.height());
		
		// Finding largest element in binary tree		
		System.out.println("largest element in tree : " + obj.largest());
		
		// search for element
		System.out.println("Enter element to be search");
		int v = sc.nextInt();
		System.out.println("Elemnt in the treee: " + obj.search(v));
		
		// counting leaf nodes	
		System.out.println("No of leaf node: " + obj.leaves());
		
		// deleting element
		System.out.println("Enter element to be deleted:");
		int d = sc.nextInt();
		boolean result = obj.delBst(d);
		if(result)
			System.out.println("deleted");
		else
			System.out.println("Not found");
		obj.inorder();

	}
}
