package String_prg;

import java.util.*;
import java.util.Scanner;

public class Remove_Duplicate_char_in_String {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		Set lhs= new LinkedHashSet();
		for(int i=0;i<arr.length;i++)
		{
		  lhs.add(arr[i]);
		}
		String result="";
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			result=result+itr.next();
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}


}
