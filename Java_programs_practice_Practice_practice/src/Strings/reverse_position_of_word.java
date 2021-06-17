package Strings;

import java.util.Scanner;

public class reverse_position_of_word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		String word="";
		int count=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=' ')
			{
				word=arr[i]+word;
				
			}
			if(arr[i]==' '||i==0)
			{
				 
				System.out.print(word+" ");
				word="";
				count=0;
				}
			}
		
		
		
		// TODO Auto-generated method stub

	}

}
