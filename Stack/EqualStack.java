import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Stack;

public class EqualStack 
{
	public static void main(String args[])
	{		
		Scanner sc= new Scanner(System.in);
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();
		int sum1 =0 , sum2=0 , sum3=0;
		
	// for stack 1	
			System.out.println("enter height for stack 1:");
			int h1 = sc.nextInt();
			System.out.println("Start entering elements");
			for(int j = 0;j<h1;j++)
			{
				int v = sc.nextInt();
				sum1+=v;
				s1.push(v);
			}
			
	// for stack 2
			System.out.println("enter height for stack 2:");
			int h2 = sc.nextInt();
			System.out.println("Start entering elements");
			for(int j = 0;j<h2;j++)
			{
				int v = sc.nextInt();
				sum2+=v;
				s2.push(v);
			}	
			
// 		for stack 3
			System.out.println("enter height for stack 3:");
			int h3 = sc.nextInt();
			System.out.println("Start entering elements");
			for(int j = 0;j<h3;j++)
			{
				int v = sc.nextInt();
				sum3+=v;
				s3.push(v);
			}

// check for height equality 
			while(sum1!=sum2 || sum2!=sum3)
			{
				if(sum1>sum2 && sum1>sum3)
					sum1-=s1.pop();
				else if(sum2 >sum1 && sum2>sum3)
					sum2-=s2.pop();
				else if(sum3>sum1 && sum3>sum2)
					sum3-=s3.pop();
				else
					sum1=0;
			}
			
			System.out.println(sum1);		
	}
}
