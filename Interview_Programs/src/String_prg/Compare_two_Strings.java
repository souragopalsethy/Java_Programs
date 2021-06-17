package String_prg;
import java.util.*;

public class Compare_two_Strings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string one");
		String s1=sc.next();
		System.out.println("Enter the string two");
		String s2= sc.next();
		//way one to solve
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		if(arr1.length!=arr2.length)
			System.out.println("String are different");
		else if(arr1.length==arr2.length)
		{
			int i;
			for( i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
					break;
			}
			if(arr1.length==i)
				System.out.println("Both string are same");
			else
				System.out.println("both string are not same");
		}
		//way2
		System.out.println("Checking String same or not in second way");
		ArrayList al1= new ArrayList();
		for(int i=0;i<arr1.length;i++)
		{
			al1.add(arr1[i]);
		}
		int j=0,count=0;
		for (Object ob : al1) {
			if((char)ob==arr2[j])
			{
				count++;
				j++;
			}
			
		}
		if(count==arr1.length)
		{
			System.out.println("Both string are same ");
		}
		else
			System.out.println("Both stringbare different");
		
		
		// TODO Auto-generated method stub

	}

}
