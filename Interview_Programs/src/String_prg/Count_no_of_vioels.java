package String_prg;

import java.util.Scanner;

public class Count_no_of_vioels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		char arr[]=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
			{
				count++;
			}
		}
		System.out.println("Total no of viowels are "+count);
		// TODO Auto-generated method stub

	}

}
