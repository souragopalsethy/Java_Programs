package Imp;

import java.util.Scanner;

public class imp112 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{ 
			int alpha=65+i;
		    int num=0;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(alpha-k));
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(num+l);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
