package Piramid;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=n*2-1;j++)
			{
				if(j>=(n+1)-i&&j<=(n-1)+i)
				{
					
					System.out.print("*");
					
					
				}
				else
					System.out.print(" ");
			
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
