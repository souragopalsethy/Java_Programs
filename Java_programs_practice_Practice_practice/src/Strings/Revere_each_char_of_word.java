package Strings;

import java.util.Scanner;

public class Revere_each_char_of_word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		String word="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				word=arr[i]+word;
				
			}
			if(arr[i]==' '||i==arr.length-1)
			{
				
				System.out.print(word);
				System.out.print(arr[i]); 
				word="";
				count=0;
				}
			}
		
		
		

	}

}
