package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class initcsp {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the trng");
	String s=sc.nextLine();
	char arr[]=s.toCharArray();
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]==' '&&arr[i+1]!=' ')
		{
			if(arr[i+1]>=97)
			arr[i+1]=(char)(arr[i+1]-32);
		
		}
		if(arr[0]>=97)
			arr[0]=(char)(arr[0]-32);
	}
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}

}
