package Strings;

import java.util.Scanner;

public class No_of_char_in_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=' ')
				count++;
		System.out.println("Number of char in string: "+count);
		
	}

}
