package String_prg;

import java.util.Scanner;

public class String_palindromeo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		char arr[]=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]==arr[arr.length-1-i])
			{
				count++;
			}
		}
		if(count==arr.length/2)
			System.out.println("Given String is palidrome");
		else
			System.out.println("given String is Not palindrome");
		// TODO Auto-generated method stub

	}

}
