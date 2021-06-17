package jun16th;

import java.util.Scanner;

public class Reverse_char_of_Each_Word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		String rec="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				rec=arr[i]+rec;
			}
			if(arr[i]==' '||i==(arr.length-1))
			{
				System.out.print(rec+" ");
				rec="";
				
			}
		}
		// TODO Auto-generated method stub

	}

}
