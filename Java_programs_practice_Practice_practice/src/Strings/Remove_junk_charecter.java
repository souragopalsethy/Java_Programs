package Strings;

import java.util.Scanner;

public class Remove_junk_charecter {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the trng");
			String s=sc.nextLine();
			char arr[]=s.toCharArray();
			int j=0;
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
			if(arr[i]>=97&&arr[i]<=122||arr[i]>=65&&arr[i]<=90)
			{
				arr[j]=arr[i];
				j++;
			}
			else
			{
				count++;
				
			}
			}
			for(int i=0;i<arr.length-count;i++)
				System.out.print(arr[i]);
		//way=2
			System.out.println();
			String s2="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)>=65&&s.charAt(i)<90)
				{
					s2=s2+s.charAt(i);
				}
			}
			System.out.println(s2);
			//let we have to manupluate orig inal string the
			s=s2;
			System.out.println(s);

	}

}
