package jun18th;

import java.util.Scanner;
import java.util.*;

public class anagram_or_not {

	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string 1 ");
		String a=sc.nextLine();
		String one=a.toLowerCase();
		System.out.println("enter the string 2 ");
		String b=sc.nextLine();
		String two=b.toLowerCase();
		char arr1[]=one.toCharArray();
		char arr2[]=two.toCharArray();
		Set s1= new LinkedHashSet();
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=' ')//i used this for not adding space to my linkedhashset
			{
			s1.add(arr1[i]);
			count1++;
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(s1.contains(arr2[i]))
			{
				count2++;
			}
		}
		if(count1==count2)
			System.out.println("yes its anagram");
		else
			System.out.println("No its not anagram");
		// TODO Auto-generated method stub

	}

}
