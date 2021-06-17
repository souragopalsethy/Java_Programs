package practice;

import java.util.Scanner;

public class Count_number_of_alphabet_number_in_a_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int albhabetcount=0;
		int numbercount=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>=97&&arr[i]<=122)||(arr[i]>=65&&arr[i]<=90))
				albhabetcount++;
			else if(arr[i]>=49&&arr[i]<=57)
				numbercount++;
		}
		System.out.println("total alphabet "+albhabetcount);
		System.out.println("total number "+ numbercount);
		// TODO Auto-generated method stub

	}

}
