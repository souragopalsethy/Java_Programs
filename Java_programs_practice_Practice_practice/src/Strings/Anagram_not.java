package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class Anagram_not {

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
	int count2=0;
	boolean b=true;
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
			count++;
		}
		
		for(int i=0;i<arr2.length;i++)
			if(hs.contains(arr2[i]))
			{
				count2++;
			}
		System.out.println(count);
			if(count==count2)
				System.out.println("anagram");
			else
				System.out.println("not anagram");
			

	}

}
