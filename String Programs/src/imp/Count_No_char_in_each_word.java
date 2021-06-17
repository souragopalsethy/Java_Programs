package imp;

import java.util.Scanner;

public class Count_No_char_in_each_word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		String rec="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				rec=rec+arr[i];
				count++;
			}
			if(arr[i]==' '||i==(arr.length-1))
			{
				System.out.print(rec+" "+count+" ");
				rec="";
				count=0;
				
			}
		}
		// TODO Auto-generated method stub

	}

}
