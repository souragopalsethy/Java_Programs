package rough;

import java.util.Scanner;
import java.util.Stack;

public class Bibhu9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String Str=sc.nextLine();
		char [] arr=Str.toCharArray();
		String word="";
		Stack<String> s= new Stack<String>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				word=word+arr[i];
			}
			//System.out.println(word);
			if(arr[i]==' '||i==arr.length-1)
			{
				s.push(word);
				word="";
			}
		}
		System.out.println(s);
	}

}
