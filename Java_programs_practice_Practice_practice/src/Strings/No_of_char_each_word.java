package Strings;

import java.util.Scanner;

public class No_of_char_each_word {

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
				word=word+arr[i];
				count++;
			}
			if(arr[i]==' '||i==arr.length-1)
			{
				if(!word.equals("")) {
				System.out.println(word+" : "+count);
				word="";
				count=0;
				}
			}
		}
		
		

	}

}
