package Imp;

import java.util.Scanner;

public class imp13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print((char)(63+l));
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i;k++)
			{
				System.out.print((char)(64+k));
			}
			for(int l=2;l<=n-i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
