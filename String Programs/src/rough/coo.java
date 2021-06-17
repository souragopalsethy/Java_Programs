package rough;

import java.util.Scanner;

public class coo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int count=0;
		String op="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				count++;
				op=op+arr[i];
			}
			if(arr[i]==' '||i==(arr.length-1))
			{
				System.out.println(op+count);
				op="";
				count=0;
			}
		}
		//System.out.println(count);
	
		// TODO Auto-generated method stub

	}

}
