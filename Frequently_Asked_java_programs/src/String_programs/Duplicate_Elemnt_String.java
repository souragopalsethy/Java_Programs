package String_programs;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_Elemnt_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			
			if(hs.add(arr[i])==false)
				System.out.println(arr[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
