package String_prg;

import java.util.Scanner;

public class Print_Even_length_word_in_a_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		String result="";
		int count=0;
		System.out.println("Printing the even length word are:- ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				result=result+arr[i];
				count++;
			}
			if(arr[i]==' '||i==arr.length-1)//here i==arr.length-1 used to print the last word
			{
				if(count%2==0)
					System.out.print(result+" ");
				result="";
				count=0;
			}
				
		
		}
		// TODO Auto-generated method stub

	}

}
