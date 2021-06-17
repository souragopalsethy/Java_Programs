package Strings;

import java.util.Scanner;

public class Uppercase_lower_case {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65&&arr[i]<=90)
				arr[i]=(char)(arr[i]+32);
			else if(arr[i]>=97&&arr[i]<=122)
				arr[i]=(char)(arr[i]-32);
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		// TODO Auto-generated method stub

	}

}
