package String_Program;

import java.util.Scanner;

public class number_char_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String sentence=sc.nextLine();
	char arr[]=sentence.toCharArray();
	int count=0;
	String word="";
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=' ') {
		count++;
		word=word+arr[i];}
		if((arr[i]==' '&&arr[i+1]!=' ')||i==arr.length-1)
		{
			System.out.println(word+" : "+count);
			count=0;
			word="";
		}
		
	}
	}

}
