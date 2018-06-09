import java.util.HashMap;
import java.util.Scanner;

public class Anagrams 
{
	static boolean isAnagram(String s1, String s2)
	{
		boolean check = true;
// 1. First check by comparing length
		if(s1.length() != s2.length())
			check = false;	
// 2. If length is equal , we proceed further
		else
		{
// 3. Converting both the string to lower case 
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
// 4.Using hashmap to store character and its count
			HashMap<Character, Integer> store = new HashMap<Character, Integer>();
// 5. storing first string in hashmap character by character
			for(int i =0;i<s1.length();i++)
			{
				char a = s1.charAt(i);
// 6. check if the character is present in the hashmap. If present increase the count or else store 1
				if(!store.containsKey(a))
					store.put(a, 1);
				else
				{
					Integer count = store.get(a);
					store.put(a, ++count);
				}
			}
// 7.checking for next string. If not present or if count is 0 then return false else reduce frequency by 1
		     for(int i= 0;i<s2.length();i++)
		     {
		    	 char b = s2.charAt(i);
		    	 if(!store.containsKey(b))
		    	 {
		    		 check = false;
		    		 break;
		    	 }
		    	 
		    	Integer count = store.get(b);
		    	
		    	if(count == 0)
		    	{
		    		check = false;
		    		break;
		    	}		    		
		    	else
		    		store.put(b, --count);		    		
		     }  		
	}
		return check;
}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = sc.nextLine();
		System.out.println("Enter String 2");
		String s2 = sc.nextLine();
		
		boolean flag = isAnagram(s1,s2);
		if(flag == true)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

}
