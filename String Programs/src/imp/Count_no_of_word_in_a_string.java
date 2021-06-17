package imp;

import java.util.Scanner;

public class Count_no_of_word_in_a_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String with Spaces no problem");
		String s= sc.nextLine();
		char[] ch=s.toCharArray();
		int count=1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]!=' '&&ch[i+1]==' ')
			count++;
		}
		System.out.println("Number of word in given String is > "+count);
		// TODO Auto-generated method stub

	}

}
