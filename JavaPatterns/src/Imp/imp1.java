package Imp;

import java.util.Scanner;

public class imp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
	      int k=n-i;
		
			for(int j=0;j<=n;j++)
			{
				if(j<n+1-i)
				{
					
					System.out.print(" "+(k));
					k--;
				}
				else
					System.out.print(" ");
			
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
