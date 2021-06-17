package inteship_Asignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		int count=0;
		String s=sc.nextLine();
		Pattern p=Pattern.compile("[0-9]");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			count++;
		}
		System.out.println(count);
	}

}
