package imp;

import java.util.Scanner;

public class String_upper_to_lowe_viceversa {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Upper And loew case mix string ");
			String s= sc.nextLine();
			char[] ch=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
				{
					ch[i]=((char)(ch[i]+32));
				}
				else if(ch[i]>=97&&ch[i]<=122)
				{
					ch[i]=((char)(ch[i]-32));
				}
			
			}
			String st=new String(ch);
			System.out.println("after con lw to upp vice versa > "+st);
		// TODO Auto-generated method stub

	}

}
