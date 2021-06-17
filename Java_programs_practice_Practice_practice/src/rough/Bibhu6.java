package rough;

import java.util.Scanner;

public class Bibhu6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char element=' ';
		int index=0;
		int count=0;
		char [] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]==' ')
			{
				element=arr[i+1];
				index=i;
				break;
				
			}
		}
		for(int i=0;i<index;i++)
		{
			char temp=arr[i];
			if(temp==element)
			{
				count++;
			}
		}
		
		
		System.out.println("Element "+element+"  comes :  "+count);	}
	
	

}
