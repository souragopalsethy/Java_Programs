package LeftAngleTringle;

import java.util.Scanner;

public class Final2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
		// TODO Auto-generated method stub

	}

}
