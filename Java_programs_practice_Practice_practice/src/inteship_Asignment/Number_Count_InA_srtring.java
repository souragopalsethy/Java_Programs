package inteship_Asignment;

import java.util.Scanner;

public class Number_Count_InA_srtring {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
System.out.println("Number in String is : "+numcount(s));
		
		
	}
public  static int numcount(String s) {
	char arr[]=s.toCharArray();
	int count=0;
	if(arr[0]>=48&&arr[0]<=57)
		count++;
	for(int i=0;i<arr.length-2;i++)
	{
		if(arr[i]==' '&&arr[i+1]!=' ')
		{
			if((arr[i+1]>=48&&arr[i+1]<=57))
				if(!(arr[i+2]>=65&&arr[i+2]<=122))
				{
				count++;
				System.out.println("exist");
				}
		}
	}
	return count;
	
}
}
