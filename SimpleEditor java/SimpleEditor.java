import java.util.Scanner;
import java.util.Stack;

public class SimpleEditor
{

	 static Stack<String> s = new Stack<String>();
		static String global_str ="";

		
		static void appendStr(String str)
		{
			if(!s.empty())
			{
				
	            global_str = s.peek() + str;
				s.push(global_str);
			}
			else
			{
				global_str = str;
				s.push(global_str);
			}
			
		}
		
		static void deleteStr(int k)
		{
			global_str = s.peek();
			global_str = global_str.substring(0,global_str.length()-k) ;
			s.push(global_str);
		}
		
		static void printStr(int k)
		{
			global_str = s.peek();
			System.out.println(global_str.charAt(k-1));	
		}
		
		static void undo()
		{
			s.pop();			 
		}

	    public static void main(String[] args)
	    {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	       String input = "";
	     	int index=0;
	     	int choice=0;
	     	 System.out.println("press 1 : to append string \n press 2: to delete characters \n press 3: to print chracters "
	 	        		+ "\n press 4: undo \n press 5: exit");
			
	     	do {
	     		
	     choice = sc.nextInt();
	 			
	     		if(choice==1)
				{
				    input = sc.next();
					appendStr(input);
				}
				
				if(choice==2)
				{
					index=sc.nextInt();
					deleteStr(index);
				}
				
				if(choice==3)
				{
					index =sc.nextInt();
					printStr(index);
				}
				
				if(choice==4)
				{
					undo();
				}
				
			} while(choice!=5);

	     	}
	}





















