package String_Program;

import java.util.Scanner;

public class Most_Occuring_Char_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ebter the String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int max=0;
		char element=' ';
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[j]==arr[i])
				{
					++count;
				}
			}
			if(count>max)
			{
				max=count;
				element=arr[i];
			}
		}
		System.out.println("The most occuring char is "+element+" number of times is "+max);
	}

}
