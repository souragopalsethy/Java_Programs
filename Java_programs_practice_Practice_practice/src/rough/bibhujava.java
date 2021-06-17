package rough;

import java.util.ArrayList;
import java.util.Scanner;

public class bibhujava {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String input=sc.nextLine();
		String word="";
		ArrayList< String> al= new ArrayList<String>();
		char [] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				word=word+arr[i];
			}
			System.out.println(word);
			if((arr[i]==' '&&arr[i+1]!=' ')||i==arr.length-1)
			{
			al.add(word);
				word="";
			}
		}
		System.out.println(al);
		// TODO Auto-generated method stub

	}

}
