package String_Program;

import java.util.Scanner;

public class Reverse_each_char_each_word {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String sentence=sc.nextLine();
	char arr[]=sentence.toCharArray();
	int count=0;
	String word="";
	String output="";
	for(int i=0;i<arr.length;i++)
	{
		
		word=arr[i]+word;
		if((arr[i]==' '&&arr[i+1]!=' ')||i==arr.length-1)
		{
			output=output+word;

			word="";
		}
		
	}
	System.out.println(output);
	}

}
