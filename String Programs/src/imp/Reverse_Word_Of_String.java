package imp;

import java.util.Scanner;

public class Reverse_Word_Of_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		String rec="";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=32)
			{
				rec=arr[i]+rec;
			}
			if(arr[i]==32||i==0)// here if i dong give i==0 the this not come to last
			{
				System.out.print(rec+" ");
				rec="";
				
			}
		}
		//System.out.println(rec);
		// TODO Auto-generated method stub

	}

}
