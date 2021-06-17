package Strings;

import java.util.Scanner;

public class Sum_of_no_in_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=48&&arr[i]<=57)
			{
				sum=sum+(arr[i]-48);
			}
		}
		System.out.println("Sum of all : "+sum);

	}

}
