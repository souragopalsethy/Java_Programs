package String_prg;

import java.util.Scanner;

public class N_Reapeating_char {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		System.out.println("Enter the reapeating char exp. -1st,2nd,3rd,4th");
		int n=sc.nextInt();
		int count=0;
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1+i;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&count<n)
				{
				
		         	temp=arr[i];
		         	count++;
				}
			}
		}
        System.out.println((char)temp);
		// TODO Auto-generated method stub

	}

}
