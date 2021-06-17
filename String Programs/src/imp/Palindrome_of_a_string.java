package imp;

import java.util.Scanner;

public class Palindrome_of_a_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
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
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		// TODO Auto-generated method stub

	}

}
