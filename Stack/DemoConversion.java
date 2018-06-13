import java.util.Scanner;

public class DemoConversion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		InfixPostfix obj = new InfixPostfix ();
		System.out.println("Enter infix expression");
		String infix = sc.nextLine();
		obj.conversion(infix);
		
		InfixPrefix obj2 = new InfixPrefix ();
		obj2.conversion(infix);

	}

}
