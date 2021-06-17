package rough;

import java.util.Arrays;
import java.util.Scanner;

public class Bibhuti8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char [] arr=str.toCharArray();
		String Result="";
		String Element="";
		for(int i=0;i<arr.length;i++)
		{
			Element=Element+arr[i];
			
			if((arr[i]==' ')||(i==arr.length-1))
			{
				System.out.println(Element);
				char temp[]=Element.toCharArray();
				Arrays.sort(temp);
				String s= new String(temp);
				Result= Result+" "+s;
				Element="";
				
			}
			//System.out.println(Element);
		
		}
		
		
		
		System.out.println(Result);
		
		
		
		
		
		
		
		
		
		
		
		
		//char arr[]=str.toCharArray();
		//Arrays.sort(arr);
		//System.out.println(arr);
				//System.out.println("Res "+str);
	
	}

}
