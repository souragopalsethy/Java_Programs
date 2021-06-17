
package rough;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class anagram {
public static void main(String[] args) {
	

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String one ");
	String one=sc.next();
	System.out.println("Enter String two ");
	String second=sc.next();
	char arr1[]=one.toCharArray();
	char arr2[]=second.toCharArray();
HashSet< Character>hs = new HashSet<Character>();
int count=0;
	for(int i=0;i<arr1.length;i++)
	{
		hs.add(arr1[i]);
	}
	
	for(int i=0;i<arr2.length;i++)
		if(hs.contains(arr2[i]))
		{
			count++;
		}
		if(count==arr1.length)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		

}

}
