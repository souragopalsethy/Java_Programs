package imp;

import java.util.Scanner;

public class lenght_of_each_word_sentence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s= sc.nextLine();
		String[] ch=s.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" "+ch[i].length());
		}
			
	}

}
