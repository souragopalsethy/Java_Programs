package String_prg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Show_duplicate_Word_in_a_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String [] arr=s.split(" ");
	    Set hs= new LinkedHashSet();//this has set used for  adiing data non duplicate
		
		for(int i=0;i<arr.length;i++)
		{
			if(!hs.contains(arr[i]))
			{
				hs.add(arr[i]);
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("After removing duplicate is "+hs);
		// TODO Auto-generated method stub

	}

}
