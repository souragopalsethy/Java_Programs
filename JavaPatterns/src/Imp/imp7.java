package Imp;

import java.util.Scanner;

public class imp7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i*2-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
