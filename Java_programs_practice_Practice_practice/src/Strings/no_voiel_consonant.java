package Strings;

import java.util.Scanner;

public class no_voiel_consonant {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' '&&arr[i+1]!=' '||i==0)
			{
				
			if(arr[i+1]=='a'||arr[i+1]=='e'||arr[i+1]=='i'||arr[i+1]=='o'||arr[i+1]=='u'||arr[i+1]=='A'||arr[i+1]=='E'||arr[i+1]=='I'||arr[i+1]=='O'||arr[i+1]=='U')
			{
				count++;
			}
		    }
		}
		if(arr[0]=='a'||arr[0]=='e'||arr[0]=='i'||arr[0]=='o'||arr[0]=='u'||arr[0]=='A'||arr[0]=='E'||arr[0]=='I'||arr[0]=='O'||arr[0]=='U')
		{
			count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
