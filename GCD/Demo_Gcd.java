import java.util.Scanner;

public class Demo_Gcd 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Elucid_Dijakstra obj = new Elucid_Dijakstra();
		int c ;
		do
		{
			System.out.println();
			System.out.println("Enter option: \n Elucid- press 1 \n Dijakstra - press 2 \n exit-press 3");
			
			 c = sc.nextInt();
			
			switch(c)
			{
			case 1: System.out.println("GCD using Elucid Algorithm");
					System.out.println("enter first number");
					int no1 = sc.nextInt();
					System.out.println("Enter Second number");
					int no2 = sc.nextInt();
					int gcd_ans = obj.elucid(no1, no2);
					System.out.println("GCD is : "+ gcd_ans);
					break;
					
			case 2: System.out.println("GCD using Dijakstra Algorithm");
					System.out.println("enter first number");
					int no3 = sc.nextInt();
					System.out.println("Enter Second number");
					int no4 = sc.nextInt();
					int gcd_ans2 = obj.dijakstra(no3, no4);
					System.out.println("GCD is : "+ gcd_ans2);			
					break;
					
			default: System.exit(0);
			}		
		} while(c!=3);
	}
}
