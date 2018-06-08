
public class Elucid_Dijakstra
{
	int elucid(int x, int y)
	{
		// checking for bigger number from two integers, since we want denominator to be smaller
		
		if(x<y)
		{
			int temp = x;
			x=y;
			y=temp;
		}
		
		// using modulus operator to find remainder. 
		// If the remainder is zero , GCD is the denominator i.e lowest integer
		// else we go on using modulo operator to reach the if condition
		
		if(x%y==0)
			return y;
		else
		{
			int remain = x%y;
			x=y;
			y=remain;
			return elucid(x,y);
		}	
	}
	
	int dijakstra(int x, int y)
	{
	// checking if the two integers are equal , if equal then gcd is the integers
	// if they are not equal , we subtract the integers and the bigger integer is replace with the answer.
	// this goes on till we get two integer equal.
		if(x==y)
			return x;
		else
		{
			if(x>y)
				x=x-y;
			else
				y=y-x;
			
		 return dijakstra(x,y);	
		}
	}
	
}

