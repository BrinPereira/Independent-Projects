import java.util.Scanner;

public class DemoHeap
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter size of heap");
		int size = sc.nextInt();
		minHeap obj = new minHeap(size);
		maxHeap obj1 = new maxHeap(size);
		System.out.println("Enter no of elements");
		int no = sc.nextInt();
		System.out.println("Enter elements");
		for(int i= 0 ; i<no;i++)
		{
			int v = sc.nextInt();
			obj.add(v);			
			obj1.add(v);
		}
	
		System.out .println(obj.getMin());
		
		System.out .println(obj1.getMax());
		
		
	}

}
