package String_prg;

import java.util.Scanner;

public class First_Non_Reapeating_Char_Of_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1+i;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					System.out.println(arr[i]);
				return;//its used when matched simply return the control
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
