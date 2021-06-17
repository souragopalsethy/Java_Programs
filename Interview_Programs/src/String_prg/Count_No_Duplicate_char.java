package String_prg;

import java.util.Scanner;

public class Count_No_Duplicate_char {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			String result="";
			int count=0;
			for(int j=1+i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					result=result+arr[i];
				}
			}
			System.out.println(result+" "+count);
		}
		// TODO Auto-generated method stub

	}

}
