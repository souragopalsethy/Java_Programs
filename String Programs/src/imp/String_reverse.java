package imp;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	System.out.println("before reverse string is >  "+s);
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length/2;i++)
	{
		char temp=ch[i];
		ch[i]=ch[((ch.length-1)-i)];
		ch[((ch.length-1)-i)]=temp;
	}
	String str=new String(ch);
	System.out.println("After revrse String is > "+str);

	
	
	}

}
