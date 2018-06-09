import java.util.Scanner;

public class TowerHanoi
{
	static int tower(int n , char source , char aux , char target)
	{
		if(n==1)
		{
			System.out.println("shift " + n + " The disc from " + source + " to " + target);
			return 1;
		}
		
		else
		{
			int x = tower(n-1, source, target, aux);
			System.out.println("shift " + n + " from " + source + " to " + target);
			int y = tower(n-1, aux , source, target);
			return x+y+1;
		}			
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n , s = 0;
		System.out.println("Enter number of disks");
		n =sc.nextInt();
		s=tower(n,'A','B','C');
		System.out.println();
		System.out.println("Number of steps: " + s);
		
		

	}

}
