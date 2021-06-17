package jun_14;

import java.util.Scanner;

public class count_char_in_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		char []c=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((c[i]>=97&&c[i]<=122)||(c[i]>=65&&c[i]<=90)||(c[i]>=49&&c[i]<=57))
			{
				count++;
			}
		}
		System.out.println("Total number of charecter present except space is = "+count);
		
		// TODO Auto-generated method stub

	}

}
